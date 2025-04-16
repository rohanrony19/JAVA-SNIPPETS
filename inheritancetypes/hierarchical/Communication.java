package com.xworkz.inheritancetypes.hierarchical;

public class Communication {
        void send() { System.out.println("Sending communication"); }
    }

    class Email extends Communication {
        void sendEmail() { System.out.println("Sending email"); }
    }

    class SMS extends Communication {
        void sendSMS() { System.out.println("Sending SMS"); }
    }

    class Call extends Communication {
        void makeCall() { System.out.println("Making a call");
    }
}
