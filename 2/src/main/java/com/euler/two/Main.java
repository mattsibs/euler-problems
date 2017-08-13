package com.euler.two;

import com.euler.two.service.BruteForceService;
import com.euler.two.service.GoldenRatioService;

import java.math.BigInteger;

public class Main {
    private static final long FOUR_MILLION = 4000000L;

    public static void main(final String[] args) {
        BruteForceService bruteForceService = new BruteForceService();
        GoldenRatioService goldenRatioService = new GoldenRatioService();

        System.out.println("Sum of even fibonacci numbers that do not exceed 4 million: "
                + bruteForceService.findSum(BigInteger.valueOf(FOUR_MILLION)));

        System.out.println("Sum of even fibonacci numbers that do not exceed 4 million: "
                + goldenRatioService.findSum(BigInteger.valueOf(FOUR_MILLION)));
    }
}
