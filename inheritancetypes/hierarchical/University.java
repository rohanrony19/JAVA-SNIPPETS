package com.xworkz.inheritancetypes.hierarchical;

public class University {
        void info() { System.out.println("General university information"); }
    }

    class Student extends University {
        void study() { System.out.println("Student is studying"); }
    }

    class Professor extends University {
        void teach() { System.out.println("Professor is teaching"); }
    }

    class Staff extends University {
        void assist() { System.out.println("Staff is assisting");
    }
}
