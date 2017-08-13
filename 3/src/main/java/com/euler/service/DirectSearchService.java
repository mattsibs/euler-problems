package com.euler.service;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class DirectSearchService implements Service {

    @Override
    public List<BigInteger> findPrimeFactors(final BigInteger number) {
        return findDivisors(new BigDecimal(number), this::isPrime);
    }

    private List<BigInteger> findDivisors(final BigDecimal number, final Predicate<BigInteger> divisorCriteria) {
        List<BigInteger> divisors = new ArrayList<>();

        BigDecimal divisor = BigDecimal.valueOf(2);
        BigDecimal sqrt = BigDecimal.valueOf(Math.sqrt(number.doubleValue()));

        while (divisor.compareTo(sqrt) == -1) {

            if (divisorCriteria.test(divisor.toBigInteger())) {
                BigDecimal dividedNumber = number.divide(divisor, 2, RoundingMode.HALF_UP);

                if (dividedNumber.equals(dividedNumber.setScale(0, BigDecimal.ROUND_FLOOR))) {
                    divisors.add(divisor.toBigInteger());
                }
            }

            divisor = divisor.add(BigDecimal.ONE);
        }

        return divisors;
    }

    private boolean isPrime(final BigInteger number) {
        return number.equals(BigInteger.valueOf(2))
                || findDivisors(new BigDecimal(number), integer -> true).isEmpty();
    }
}
