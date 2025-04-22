package com.xworkz.Interface.External;

import com.xworkz.Interface.Internal.College;
import com.xworkz.Interface.Internal.Messenger;

public class Whatsapp {
    private Messenger messenger;

    public Whatsapp(Messenger messenger){
        this.messenger=messenger;
        System.out.println("Assigning Messenger instance ");
    }
    public void reel(){
        if(this.messenger!=null){
            this.messenger.sendmessage();
            System.out.println("Running reel in Whatsapp");
        }else{
            System.out.println("Null");
        }
    }
}
