package com.xworkz.Interface.External;

import com.xworkz.Interface.Internal.College;
import com.xworkz.Interface.Internal.Database;

public class postgre {
    private Database database;

    public postgre(Database database){
        this.database=database;
        System.out.println("Assigning Database instance ");
    }
    public void query(){
        if(this.database!=null){
            this.database.connect();
            System.out.println("Running query in postgre");
        }else{
            System.out.println("Null");
        }
    }
}
