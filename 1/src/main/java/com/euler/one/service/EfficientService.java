package com.euler.one.service;

public class EfficientService implements Service {

    @Override
    public int findSum(final int sumLimit) {
        return findSum(sumLimit, THREE) + findSum(sumLimit, FIVE) - findSum(sumLimit, FIFTEEN);
    }


    private int findSum(final int sumLimit, final int divider) {
        int p = (sumLimit - 1) / divider;
        return divider * (p + 1) * p / 2;
    }
}
