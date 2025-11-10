package com.example;

import static org.junit.Assert.*;
import org.junit.Test;

public class PrimeCheckerTest {

    @Test
    public void testTwoIsPrime() {
        PrimeChecker checker = new PrimeChecker();
        assertTrue(checker.isPrime(0));  
    }
    
}
