package com.github.azusa0127.starter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
	@DisplayName("42 is not a prime")
	void is42aPrime() {
        assertEquals(false, App.isPrime(42), "42 should not be a prime");
    }

    @ParameterizedTest
    @DisplayName("Primes under 30")
    @ValueSource(ints = { 1, 2, 3, 5, 7, 11, 13, 17, 19, 23, 29})
	void primesUnder30(int prime) {
        assertEquals(true, App.isPrime(prime));
    }
}
