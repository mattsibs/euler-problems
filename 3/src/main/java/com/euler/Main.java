package com.euler;

import com.euler.service.DirectSearchService;

import java.math.BigInteger;

public class Main {

    public static void main(final String[] args) {
        DirectSearchService directSearchService = new DirectSearchService();
        System.out.println(":" + directSearchService.findPrimeFactors(BigInteger.valueOf(600851475143L)));
    }

}
