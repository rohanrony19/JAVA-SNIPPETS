package com.xworkz.Interface.External;

import com.xworkz.Interface.Internal.College;
import com.xworkz.Interface.Internal.SocialMedia;

public class Platform {
    private SocialMedia socialMedia;

    public Platform(SocialMedia socialMedia){
        this.socialMedia=socialMedia;
        System.out.println("Assigning socialmedia instance ");
    }
    public void Infulence(){
        if(this.socialMedia!=null){
            this.socialMedia.Instagram();
            System.out.println("Running stuff in Manager");
        }else{
            System.out.println("Null");
        }
    }
}
