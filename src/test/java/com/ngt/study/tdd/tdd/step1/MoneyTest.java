package com.ngt.study.tdd.tdd.step1;

import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MoneyTest {

    @Test
    public void testMultiplication() {
        France five = Money.france(5);

        assertEquals(Money.france(10),five.times(2));
        assertEquals(Money.france(15),five.times(3));
    }

    @Test
    public void testEquality() {
        assertTrue(new Dollar(5, "USD").equals(new Dollar(5, "USD")));
        assertFalse(new Dollar(5, "USD").equals(new Dollar(6, "USD")));
        assertTrue(new France(5, "CHF").equals(new France(5, "CHF")));
        assertFalse(new France(5, "CHF").equals(new France(6, "CHF")));
    }

    @Test
    public void testCurrency() {
        assertEquals("USD", Money.dollar(1).currency);
        assertEquals("CHF", Money.france(1).currency);
    }

    @Test
    public void testDifferentclassEquality() {
        assertTrue(new Money(10, "CHF").equals(new France(10, "CHF")));
    }
}
