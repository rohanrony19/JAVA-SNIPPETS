package com.xworkz.inheritancetypes.multi;

 class Person {
        void speak() { System.out.println("Person is speaking"); }
    }

    class Student extends Person {
        void study() { System.out.println("Student is studying"); }
    }

    public class CollegeStudent extends Student {
        void attendLecture() { System.out.println("Attending college lecture"); }
    }


