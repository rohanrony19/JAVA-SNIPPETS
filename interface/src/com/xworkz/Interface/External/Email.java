package com.xworkz.Interface.External;

import com.xworkz.Interface.Internal.College;
import com.xworkz.Interface.Internal.Notification;

public class Email {
    private Notification notification;

    public Email(Notification notification){
        this.notification=notification;
        System.out.println("Assigning Notification instance ");
    }
    public void alert(){
        if(this.notification!=null){
            this.notification.notifyuser();
            System.out.println("Running alert in Email");
        }else{
            System.out.println("Null");
        }
    }
}
