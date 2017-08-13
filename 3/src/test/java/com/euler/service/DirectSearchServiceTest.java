package com.euler.service;

import org.junit.Test;

import java.math.BigInteger;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class DirectSearchServiceTest {

    private final DirectSearchService directSearchService = new DirectSearchService();

    @Test
    public void findDivisors() {
        List<BigInteger> divisors = directSearchService.findPrimeFactors(BigInteger.valueOf(120));

        assertThat(divisors)
                .extracting(BigInteger::intValue)
                .containsExactly(2, 3, 5);
    }

}