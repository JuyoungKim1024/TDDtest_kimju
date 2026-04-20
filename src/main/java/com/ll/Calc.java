package com.ll;

public class Calc {
    public static int run(String expression) {
        String[] bits = expression.split(" ");

        int result = Integer.parseInt(bits[0]);

        for (int i = 1; i < bits.length; i += 2) {

            int num = Integer.parseInt(bits[i + 1]);

            if (bits[i].equals("+")) {
                result += num;
            } else if (bits[i].equals("-")) {
                result -= num;
            }else if (bits[i].equals("*")) {
                result *= num;
            }
        }

        return result;
    }
}