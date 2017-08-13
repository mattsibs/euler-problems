package com.euler.service;

import java.math.BigInteger;
import java.util.List;

public interface Service {

    List<BigInteger> findPrimeFactors(final BigInteger number);

}
