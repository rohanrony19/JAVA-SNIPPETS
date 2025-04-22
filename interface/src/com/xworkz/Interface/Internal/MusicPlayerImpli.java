package com.xworkz.Interface.Internal;

public class MusicPlayerImpli implements MusicPlayer{
    public MusicPlayerImpli(){
        System.out.println("NO arg constructor in musicplayerimpli");
    }

    @Override
    public void play() {
        System.out.println("Running play in Musicplayer");
    }
}
