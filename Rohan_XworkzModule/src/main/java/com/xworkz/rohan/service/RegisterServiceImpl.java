package com.xworkz.rohan.service;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import com.xworkz.rohan.dto.RegisterDTO;
import com.xworkz.rohan.dto.UpdateDto;


import com.xworkz.rohan.entity.RegisterEntity;
import com.xworkz.rohan.repository.RegisterRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.time.LocalDateTime;
import java.util.Properties;
import java.util.Random;

@Service
public class RegisterServiceImpl implements RegisterService{
    private static final Logger log = LoggerFactory.getLogger(RegisterServiceImpl.class);
    @Autowired
    private RegisterRepository registerRepository;
    BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    @Override
    public boolean save(RegisterDTO registerDTO) {
        RegisterEntity registerEntity = new RegisterEntity();
        registerEntity.setName(registerDTO.getName());
        registerEntity.setAge(registerDTO.getAge());
        registerEntity.setEmail(registerDTO.getEmail());
        getEmail(registerEntity.getEmail(),"Register Successful","Dear User," + "\n\n Your registration for xworkz is succesful"); //email integration
        registerEntity.setAddress(registerDTO.getAddress());
        registerEntity.setGender(registerDTO.getGender());
        registerEntity.setPhoneNumber(registerDTO.getPhoneNumber());;
        registerEntity.setPassword(passwordEncoder.encode(registerDTO.getPassword()));
        return registerRepository.save(registerEntity);
    }

    @Override
    public RegisterDTO find(String name, String password) {
        RegisterDTO registerDTO = new RegisterDTO();
        LocalDateTime localDateTime = LocalDateTime.now();

        RegisterEntity entity = registerRepository.find(name);
        if(entity==null){
            registerDTO.setName("notFound");
            return registerDTO;
        }
        else {
            if(entity.getLoginAttempt()==3){
                if(localDateTime.isAfter(entity.getLocalDateTime())){
                    RegisterDTO dto = new RegisterDTO();
                    dto.setName("Timeout");
                    return dto;
                }else {
                    RegisterDTO dto = new RegisterDTO();
                    dto.setName("Locked");
                    getEmail(entity.getEmail(),"Account Status","Dear " + entity.getName()+"\\n\\nYour account has been Blocked for 24hrs .Please reset the password after 24hrs");
                    return dto;
                }
            }
            else {
                if(passwordEncoder.matches(password,entity.getPassword())){
                    BeanUtils.copyProperties(entity,registerDTO);
                    entity.setLoginAttempt(0);
                    entity.setLocalDateTime(null);
                    return registerDTO;
                }else {
                    int trails = entity.getLoginAttempt() + 1;
                    entity.setLocalDateTime(localDateTime);
                    entity.setLoginAttempt(trails);
                    if(entity.getLoginAttempt()==3){
                        entity.setLocalDateTime(entity.getLocalDateTime().plusDays(1));
                    }
                }
            }
            registerRepository.updateTable(entity);
            return null;
        }
    }
    String fetchedEmail="";
    @Override
    public RegisterDTO findByEmail(String email) {
        RegisterEntity register = registerRepository.findByEmail(email);
        if(register.getEmail()==null){
            return null;
        }else {
            RegisterDTO registerDTO = new RegisterDTO();
            BeanUtils.copyProperties(register, registerDTO);
            System.out.println(registerDTO.toString());
            fetchedEmail = registerDTO.getEmail();
            return registerDTO;
        }
    }

    @Override
    public boolean updatePassword(String password) {
        boolean update=registerRepository.updatePassword(fetchedEmail,passwordEncoder.encode(password));

        getEmail(fetchedEmail,"Password Changed","Dear User"+"\n\nPassword For your account was changed");

        return update;
    }

    @Override
    public boolean updateProfile(UpdateDto dto) {
        RegisterEntity register=new RegisterEntity();
        register.setName(dto.getName());
        register.setEmail(dto.getEmail());
        register.setPhoneNumber(dto.getPhone());
        register.setAge(dto.getAge());
        register.setAddress(dto.getAddress());

        return registerRepository.updateProfile(register);
    }
    private String generatedOtp="";
    @Override
    public void sendOtp(String email) {
        Random random=new Random();
        StringBuilder builder=new StringBuilder();
        for (int i = 0; i <6 ; i++) {
            builder.append(random.nextInt(10));
        }
        generatedOtp=builder.toString();
        getEmail(email,"OTP Sent","Dear User ,"+"\nThe Otp for  you is \n"+generatedOtp);
    }

    @Override
    public boolean verifyOtp(String otp) {
        return otp.equals(generatedOtp);
    }

    private void getEmail(String email, String subject, String body) {


        final String username = "rohanprasad.rony@gmail.com";
        final String password = "";

        Properties prop = new Properties();
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "587");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.starttls.enable", "true"); //TLS

        Session session = Session.getInstance(prop,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });
        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipients(
                    Message.RecipientType.TO,
                    InternetAddress.parse(email)
            );
            message.setSubject(subject);
            message.setText(body);

            Transport.send(message);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
