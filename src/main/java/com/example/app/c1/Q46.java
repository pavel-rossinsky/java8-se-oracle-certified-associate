package com.example.app.c1;

public class Q46 {
    String color = "red";
    private void printColor(String color) {
        color = "purple";
        System.out.print(color);
    }
    public static void main(String[] rider) {
        new Q46().printColor("blue");
    }
}
