package com.euler.one.service;


import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BruteForceServiceTest {

    private final BruteForceService bruteForceService = new BruteForceService();

    @Test
    public void findSum_Ten() throws Exception {
        int sum = bruteForceService.findSum(10);
        assertThat(sum).isEqualTo(23);
    }

    @Test
    public void findSum_Fifteen() throws Exception {
        int sum = bruteForceService.findSum(15);
        assertThat(sum).isEqualTo(45);
    }

    @Test
    public void findSum_Sixteen() throws Exception {
        int sum = bruteForceService.findSum(16);
        assertThat(sum).isEqualTo(60);
    }
}