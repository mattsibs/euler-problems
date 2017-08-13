package com.euler.two.generator;

import org.junit.Test;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


public class FibonacciGeneratorTest {

    private final FibonacciGenerator fibonacciGenerator = new FibonacciGenerator();

    @Test
    public void forEachFibonacci_getAllToTen() {
        List<BigInteger> fibonacciNumbers = new ArrayList<>();

        fibonacciGenerator.forEachFibonacci(BigInteger.valueOf(10L), fibonacciNumbers::add);

        assertThat(fibonacciNumbers)
                .extracting(BigInteger::intValue)
                .containsExactlyInAnyOrder(1, 1, 2, 3, 5, 8);
    }

}