package com.xworkz.inheritancetypes.multi;

class School {
        void educate() { System.out.println("Educating students"); }
    }

    class Class extends School {
        void assignTeacher() { System.out.println("Assigning teacher to class"); }
    }

public class StudentGroup extends Class {
        void formGroup() { System.out.println("Forming student group");
    }
}
