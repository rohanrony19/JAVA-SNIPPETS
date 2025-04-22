package com.xworkz.Interface.External;

import com.xworkz.Interface.Internal.Icc;

public class BCCI {
    private Icc icc;
    public Icc icc1;
    public BCCI(Icc icc){
        this.icc=icc;
        System.out.println("Assigning Icc instance to current class");
    }
    public void cricket(Icc icc1){

        this.icc=icc1;
        System.out.println("Criket Runner");
    }
    public void play(){
        if(this.icc!=null){
            this.icc.fairPlay();
            System.out.println("Running Play in BCCI");
        }else{
            System.out.println("null");
        }
    }
}
