package com.euler.one.service;


import java.util.stream.IntStream;

public class BruteForceService implements Service {

    @Override
    public int findSum(final int sumLimit) {
        IntStream divisorsThree = findDivisors(sumLimit, THREE);
        IntStream divisorsFive = findDivisors(sumLimit, FIVE);

        return IntStream.concat(
                divisorsThree,
                divisorsFive
        ).distinct().sum();
    }


    private IntStream findDivisors(final int sumLimit, final int divider) {
        int numberOfDivisors = (sumLimit - 1) / divider;

        return IntStream.range(1, numberOfDivisors + 1)
                .map(i -> i * divider);
    }
}
