package com.example.app.c1;

// Compilation failure: non-static variable birds cannot be referenced from a static context
public class Q12 {
    int birds = 10;
    public static void main(String[] data) {
        int trees = 5;
        // System.out.println(true + birds);
    }
}
