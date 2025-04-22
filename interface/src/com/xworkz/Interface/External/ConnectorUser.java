package com.xworkz.Interface.External;

import com.xworkz.Interface.Internal.Connector;
import com.xworkz.Interface.Internal.ConnectorImpli;

public class ConnectorUser {
    private Connector connector;

    public ConnectorUser(Connector connector){
        this.connector=connector;
        System.out.println("Assigning Connector instance to current class");
    }
    public void wire(){
        if(this.connector!=null){
            this.connector.cabel();
            System.out.println("Running wire in connectorUser");

        }else{
            System.out.println("Connector is null");
        }
    }
}
