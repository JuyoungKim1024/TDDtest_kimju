package com.ll;

public class Calc {
    public static int run(String expression) {

        if (expression.contains(" + ")) {
            String[] bits = expression.split(" \\+ ");
            int num1 = Integer.parseInt(bits[0]);
            int num2 = Integer.parseInt(bits[1]);
            return num1 + num2;
        }

        if (expression.contains(" - ")) {
            String[] bits = expression.split(" - ");
            int num1 = Integer.parseInt(bits[0]);
            int num2 = Integer.parseInt(bits[1]);
            return num1 - num2;
        }

        return 0;
    }
}
