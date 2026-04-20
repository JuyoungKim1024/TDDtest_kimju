package com.ll;

public class Calc {
    public static int run(String expression) {
        while (expression.contains("(")) {
            int openIndex = expression.lastIndexOf("(");
            int closeIndex = expression.indexOf(")", openIndex);

            String innerExpression = expression.substring(openIndex + 1, closeIndex);
            int innerResult = run(innerExpression);

            expression = expression.substring(0, openIndex)
                    + innerResult
                    + expression.substring(closeIndex + 1);
        }
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