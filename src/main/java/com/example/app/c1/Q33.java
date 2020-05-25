package com.example.app.c1;

public class Q33 {
    static int start = 2;
    final int end;

    public Q33(int x) {
        x = 4;
        end = x;
    }

    public void fly(int distance) {
        System.out.print(end - start + " ");
        System.out.print(distance);
    }

    public static void main(String... start) {
        new Q33(10).fly(5);
    }
}
