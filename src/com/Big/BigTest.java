package com.Big;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @author 51465
 */
public class BigTest {
    public static void main(String[] args) {
        BigInteger bigInteger = new BigInteger("1357861794512935628735");
        BigDecimal bigDecimal1 = new BigDecimal("161346121");
        BigDecimal bigDecimal2 = new BigDecimal("2134.1234");
        System.out.println(bigInteger);
        System.out.println(bigDecimal1.divide(bigDecimal2,4,BigDecimal.ROUND_HALF_UP));
    }
}
