package com.euler.two.service;

import com.euler.two.generator.FibonacciGenerator;

import java.math.BigInteger;

public class BruteForceService implements Service {

    private final FibonacciGenerator fibonacciGenerator = new FibonacciGenerator();

    @Override
    public BigInteger findSum(final BigInteger limit) {
        final EncapsulatedInteger runningTotal = new EncapsulatedInteger();

        fibonacciGenerator.forEachFibonacci(limit, fibNumber -> {
            if (fibNumber
                    .mod(BigInteger.valueOf(2L))
                    .equals(BigInteger.ZERO)) {

                runningTotal.increment(fibNumber);
            }
        });

        return runningTotal.getValue();
    }

    private static class EncapsulatedInteger {
        private BigInteger encapsulated = BigInteger.ZERO;

        private void increment(final BigInteger value) {
            encapsulated = encapsulated.add(value);
        }

        private BigInteger getValue() {
            return encapsulated;
        }
    }
}
