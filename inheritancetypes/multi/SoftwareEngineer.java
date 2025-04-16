package com.xworkz.inheritancetypes.multi;

class Job {
        void doJob() { System.out.println("Doing a job"); }
    }

    class TechJob extends Job {
        void techSkills() { System.out.println("Applying technical skills"); }
    }

public class SoftwareEngineer extends TechJob {
        void writeCode() { System.out.println("Writing Java code");
    }
}
