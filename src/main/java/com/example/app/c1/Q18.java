package com.example.app.c1;

// Compilation failure: cannot find symbol
// [ERROR]   symbol:   variable height
public class Q18 {
    public static void main(String[] args) {
        String tree = "pine";
        int count = 0;
        if (tree.equals("pine")) {
            int height = 55;
            count = count + 1;
        }
        // System.out.println(height + count);
    }
}
