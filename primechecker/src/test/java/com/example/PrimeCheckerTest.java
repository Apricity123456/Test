package com.example;

import static org.junit.Assert.*;
import org.junit.Test;

public class PrimeCheckerTest {

    @Test
    public void testZeroIsNotPrime() {
        PrimeChecker checker = new PrimeChecker();
        assertFalse(checker.isPrime(0));
    }
}
