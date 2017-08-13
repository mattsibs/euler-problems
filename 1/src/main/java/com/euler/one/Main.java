package com.euler.one;

import com.euler.one.service.BruteForceService;
import com.euler.one.service.EfficientService;

public class Main {

    public static void main(final String[] args) {
        BruteForceService bruteForceService = new BruteForceService();
        EfficientService efficientService = new EfficientService();

        System.out.println("Sum of multiples of 3 and 5 below 1000: " + bruteForceService.findSum(1000));
        System.out.println("Sum of multiples of 3 and 5 below 1000: " + efficientService.findSum(1000));
    }
}
