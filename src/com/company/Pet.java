package com.company;

import com.company.animals.Cat;

public class Pet extends Cat {

    public static void printName() {
        System.out.printf("Pet's name is %s.\n", name);
    }

    public static void printWeight() {
        System.out.printf("Pet's weight is %d kg.\n", weight);
    }
}