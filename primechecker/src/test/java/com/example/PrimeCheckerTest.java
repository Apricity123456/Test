package com.example;

import static org.junit.Assert.*;
import org.junit.Test;

public class PrimeCheckerTest {

    // @Test
    // public void testZeroIsPrime() {
    //     PrimeChecker checker = new PrimeChecker();
    //     assertTrue(checker.isPrime(0));
    // }

    @Test
    public void testZeroIsNotPrime() {
        PrimeChecker checker = new PrimeChecker();
        assertFalse(checker.isPrime(0));
    }
}
