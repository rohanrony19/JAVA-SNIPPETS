package com.xworkz.Interface.Internal;

public class NotificationImpli implements Notification{

    public NotificationImpli(){
        System.out.println("No arg constructor Notificationimpli");
    }
    @Override
    public void notifyuser() {
        System.out.println("overriding notifyuser in notifiactionimpli");
    }
}
