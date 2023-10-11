package com.codegym;

public class PassByValue {

    public static void main(String[] args) {
        int a = 3;
        int b = a;
        System.out.println("a: " + a);
        System.out.println("b: " + b);

        a = 5;
        System.out.println("a: " + a);
        System.out.println("b: " + b);

        b = 8;
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
}
