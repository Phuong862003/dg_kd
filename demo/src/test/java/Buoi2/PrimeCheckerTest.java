package Buoi2;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class PrimeCheckerTest {
    @Test
    void testIsPrime(){
        PrimeChecker checker = new PrimeChecker();

        assertFalse(checker.isPrime(0));
        assertFalse(checker.isPrime(1));
        assertTrue(checker.isPrime(2));
        assertTrue(checker.isPrime(4));
        // assertFalse(checker.isPrime(6));
        assertTrue(checker.isPrime(17));
        assertFalse(checker.isPrime(19));
    }

    @Test
    void testCheck(){
        PrimeChecker checker = new PrimeChecker();

        checker.checkPrime(10);
    }
}
