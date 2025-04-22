package com.xworkz.Interface.Internal;

public class MessengerImpli implements Messenger{
    public MessengerImpli(){
        System.out.println("No arg constructor in messageimpli");
    }

    @Override
    public void sendmessage() {
        System.out.println("overriding sendmessage in messageimpli");
    }
}
