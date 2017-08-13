package com.euler.one.service;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class EfficientServiceTest {

    private final EfficientService efficientService = new EfficientService();

    @Test
    public void findSumEfficient_Ten() throws Exception {
        double sum = efficientService.findSum(10);
        assertThat(sum).isEqualTo(23);
    }

    @Test
    public void findSumEfficient_Fifteen() throws Exception {
        double sum = efficientService.findSum(15);
        assertThat(sum).isEqualTo(45);
    }

    @Test
    public void findSumEfficient_Sixteen() throws Exception {
        double sum = efficientService.findSum(16);
        assertThat(sum).isEqualTo(60);
    }
}