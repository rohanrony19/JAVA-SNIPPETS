package com.xworkz.Interface.Runner;

import com.xworkz.Interface.External.*;
import com.xworkz.Interface.Internal.*;

public class Runner {
    public static void main(String[] args) {
        Connector connector=new ConnectorImpli();
        ConnectorUser connectorUser=new ConnectorUser(connector);
        connectorUser.wire();
        System.out.println(" ");

        Icc icc = new IndianCricketTeamIccImpl();
        BCCI bcci = new BCCI(icc);
        bcci.cricket(icc);
        bcci.play();
        System.out.println(" ");

        Constitution constitution=new CitizenConstituionImpl();
        Government government=new Government(constitution);
        government.policy();
        System.out.println(" ");

        Laptop laptop=new LaptopImpli();
        OperatingSystem operatingSystem=new OperatingSystem(laptop);
        operatingSystem.core();
        System.out.println(" ");

        College college=new CollegeImpli();
        Manager manager=new Manager(college);
        manager.stuff();
        System.out.println(" ");

        Company company=new CompanyImpli();
        Organization organization=new Organization(company);
        organization.Clients();
        System.out.println(" ");

        Car car=new CarImpli() ;
        Brand brand=new Brand(car);
        brand.race();
        System.out.println(" ");

        SocialMedia socialMedia=new SocialMediaImpli();
        Platform platform=new Platform(socialMedia);
        platform.Infulence();
        System.out.println(" ");

        Internship internship=new InternshipImpli();
        Training training=new Training(internship);
        training.couching();
        System.out.println(" ");

        Movie movie=new MovieImpli();
        FilmIndustry filmIndustry=new FilmIndustry(movie);
        filmIndustry.direction();
        System.out.println(" ");

        Animal a = new Dog();
        PetOwner owner = new PetOwner(a);
        owner.callPet();
        System.out.println(" ");

        Device d = new DeviceImpli();
        User u = new User(d);
        u.operate();
        System.out.println(" ");

        Tool tool=new Hammer();
        Worker worker=new Worker(tool);
        worker.build();
        System.out.println(" ");

        Payment payment=new PaymentImpli();
        CreditCard creditCard=new CreditCard(payment);
        creditCard.pay();
        System.out.println(" ");

        Shape shape=new ShapeImpli();
        Circle circle=new Circle(shape);
        circle.paint();
        System.out.println(" ");

        Messenger messenger=new MessengerImpli();
        Whatsapp whatsapp=new Whatsapp(messenger);
        whatsapp.reel();
        System.out.println(" ");

        Notification notification=new NotificationImpli();
        Email email=new Email(notification);
        email.alert();
        System.out.println(" ");

        Vehicle vehicle=new VehicleImpli();
        Audi audi=new Audi(vehicle);
        audi.rise();
        System.out.println(" ");

        MusicPlayer musicPlayer=new MusicPlayerImpli();
        Spotify spotify=new Spotify(musicPlayer);
        spotify.pause();
        System.out.println(" ");

        Database database=new DatabaseImpli();
        postgre postgree =new postgre(database);
        postgree.query();
        System.out.println(" ");
    }
}
