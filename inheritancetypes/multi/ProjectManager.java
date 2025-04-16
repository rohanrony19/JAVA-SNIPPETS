package com.xworkz.inheritancetypes.multi;

class Employee {
        void work() { System.out.println("Employee is working"); }
    }

    class Manager extends Employee {
        void manage() { System.out.println("Manager is managing"); }
    }

public class ProjectManager extends Manager {
        void planProject() { System.out.println("Planning the project"); }
    }

