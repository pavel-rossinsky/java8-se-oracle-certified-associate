package com.example.app.c1;

// Compilation failure [ERROR] /var/www/java8-se-oracle-certified-associate/src/main/java/com/example/app/c1/Q44.java:[8,28] non-static variable numLock cannot be referenced from a static context
public class Q44 {
    private boolean numLock = true;
    static boolean capLock = false;
    public static void main(String... shortcuts) {
        // System.out.println(numLock+" "+capLock);
    }
}
