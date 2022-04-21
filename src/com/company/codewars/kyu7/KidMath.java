package com.company.codewars.kyu7;

import java.math.BigInteger;

public class KidMath {
    public static void main(String[] args) {

        BigInteger a = BigInteger.valueOf(2);
        BigInteger b = BigInteger.valueOf(3);
        System.out.println(pow(a, b));


    }

    public static BigInteger pow(BigInteger base, BigInteger exponent) {
        if (exponent.intValue() < 1) {
            return BigInteger.valueOf(-1);
        }
        for (int i = 0; i < exponent.intValue(); i++) {
            base = base.multiply(base);
        }
        return base;
/*        BigInteger result = BigInteger.ONE;
        while (exponent.signum() > 0) {
            if (exponent.testBit(0)) result = result.multiply(base);
            base = base.multiply(base);
            exponent = exponent.shiftRight(1);
        }
        return result;*/
    }
}
