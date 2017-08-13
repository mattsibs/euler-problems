package com.euler.two.service;

import java.math.BigDecimal;
import java.math.BigInteger;

public class GoldenRatioService implements Service {

    private static final double GOLDEN_RATIO = (1 + Math.sqrt(5)) / 2;

    private static final BigDecimal FIRST_EVEN_FIB_NUMBER = BigDecimal.valueOf(2);

    @Override
    public BigInteger findSum(final BigInteger limit) {
        BigDecimal currentSequenceValue = FIRST_EVEN_FIB_NUMBER;

        BigInteger sum = BigInteger.ZERO;

        while (isLessThan(limit, currentSequenceValue)) {
            sum = sum.add(currentSequenceValue.toBigInteger());

            currentSequenceValue = currentSequenceValue
                    .multiply(BigDecimal.valueOf(GOLDEN_RATIO).pow(3))
                    .setScale(0, BigDecimal.ROUND_HALF_UP);
        }

        return sum;
    }

    private boolean isLessThan(final BigInteger limit, final BigDecimal currentSequenceValue) {
        return currentSequenceValue
                .compareTo(new BigDecimal(limit)) == -1;
    }
}
