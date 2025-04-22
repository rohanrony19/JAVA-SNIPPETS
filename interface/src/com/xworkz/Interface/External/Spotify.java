package com.xworkz.Interface.External;

import com.xworkz.Interface.Internal.College;
import com.xworkz.Interface.Internal.MusicPlayer;

public class Spotify {
    private MusicPlayer musicPlayer;

    public Spotify(MusicPlayer musicPlayer){
        this.musicPlayer=musicPlayer;
        System.out.println("Assigning musicplayer instance ");
    }
    public void pause(){
        if(this.musicPlayer!=null){
            this.musicPlayer.play();
            System.out.println("Running pause in spotify");
        }else{
            System.out.println("Null");
        }
    }
}
