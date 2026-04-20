package com.ll;

public class Calc {
    public static int run(String expression) {
        String[] bits = expression.split(" ");
        int result = 0;
        int num = Integer.parseInt(bits[0]);
        String sign = "+";

        for (int i = 1; i < bits.length; i += 2) {
            if (bits[i].equals("*")) {
                num *= Integer.parseInt(bits[i + 1]);
            } else {
                if (sign.equals("+")) {
                    result += num;
                } else if (sign.equals("-")) {
                    result -= num;
                }

                sign = bits[i];
                num = Integer.parseInt(bits[i + 1]);
            }
        }

        if (sign.equals("+")) {
            result += num;
        } else if (sign.equals("-")) {
            result -= num;
        }

        return result;
    }
}