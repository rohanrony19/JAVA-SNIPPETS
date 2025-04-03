package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.tree.Tree;
import com.xworkz.inheritence.internal.tree.Oak;

public class TreeRunner {
    public static void main(String[] args) {
        Tree tree = new Oak();
        tree.roots();
        tree.branches();
        tree.leaves();
        tree.oxygen();
        tree.lifespan();

        System.out.println("-----------");

        Oak oak = new Oak();
        oak.roots();
        oak.branches();
        oak.leaves();
        oak.oxygen();
        oak.lifespan();
    }
}
