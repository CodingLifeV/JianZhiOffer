package com.offer;

/**
 * 数值的整数次方
 */
public class Program_16 {
    public double Power(double base, int exponent) {
        if (exponent == 0) return 1;
        if (exponent == 1) return base;
        boolean isNegative = false;
        if (exponent < 0) {
            exponent = -exponent;
            isNegative = true;
        }
        double power = Power(base * base, exponent /2 );
        if (exponent % 2 != 0) {
            power = power * base;
        }
        return isNegative ? 1 / power : power;
    }
}
