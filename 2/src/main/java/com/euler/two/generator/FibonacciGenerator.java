package com.euler.two.generator;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.function.Consumer;

public class FibonacciGenerator {

    public void forEachFibonacci(final BigInteger limit, final Consumer<BigInteger> consumer) {
        forEach(limit, BigInteger.ONE, BigInteger.ZERO, consumer);
    }

    private BigInteger forEach(final BigInteger limit, final BigInteger n, final BigInteger nMinus1, final Consumer<BigInteger> consumer) {
        BigInteger currentSequenceValue = n;

        while (currentSequenceValue.compareTo(limit) == -1) {
            consumer.accept(currentSequenceValue);

            currentSequenceValue = nextFibonacci(currentSequenceValue, nMinus1);
            forEach(limit, currentSequenceValue, n, consumer);

            return currentSequenceValue;
        }

        return currentSequenceValue;
    }

    private BigInteger nextFibonacci(final BigInteger nMinus1, final BigInteger nMinusTwo) {
        return nMinus1.add(nMinusTwo);
    }

}
