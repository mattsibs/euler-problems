package com.euler.two.service;


import org.junit.Test;

import java.math.BigInteger;

import static org.assertj.core.api.Assertions.assertThat;

public class BruteForceServiceTest {

    private final BruteForceService bruteForceService = new BruteForceService();

    @Test
    public void findSum_toTwenty() {
        BigInteger sum = bruteForceService.findSum(BigInteger.valueOf(20));
        assertThat(sum.intValue())
                .isEqualTo(2 + 8);
    }

    @Test
    public void findSum_toForty() {
        BigInteger sum = bruteForceService.findSum(BigInteger.valueOf(40));
        assertThat(sum.intValue())
                .isEqualTo(2 + 8 + 34);
    }

    @Test
    public void findSum_toOneHundredAndFifty() {
        BigInteger sum = bruteForceService.findSum(BigInteger.valueOf(150));
        assertThat(sum.intValue())
                .isEqualTo(2 + 8 + 34 + 144);
    }
}