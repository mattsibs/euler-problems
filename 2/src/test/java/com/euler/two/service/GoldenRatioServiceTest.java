package com.euler.two.service;

import org.junit.Test;

import java.math.BigInteger;

import static org.assertj.core.api.Assertions.assertThat;

public class GoldenRatioServiceTest {
    private final GoldenRatioService goldenRatioService = new GoldenRatioService();

    @Test
    public void findSum_toTwenty() {
        BigInteger sum = goldenRatioService.findSum(BigInteger.valueOf(20));
        assertThat(sum.intValue())
                .isEqualTo(2 + 8);
    }

    @Test
    public void findSum_toForty() {
        BigInteger sum = goldenRatioService.findSum(BigInteger.valueOf(40));
        assertThat(sum.intValue())
                .isEqualTo(2 + 8 + 34);
    }

    @Test
    public void findSum_toOneHundredAndFifty() {
        BigInteger sum = goldenRatioService.findSum(BigInteger.valueOf(150));
        assertThat(sum.intValue())
                .isEqualTo(2 + 8 + 34 + 144);
    }

    @Test
    public void findSum_toFourMillion() {
        BigInteger sum = goldenRatioService.findSum(BigInteger.valueOf(4000000L));
        assertThat(sum.intValue())
                .isEqualTo(4613732);
    }

}