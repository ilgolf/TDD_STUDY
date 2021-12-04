package com.ngt.study.tdd.tdd.step1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

public class MoneyTest {

    @Test
    public void testMultiplication() {
        Money five = Money.france(5);

        assertThat(Money.france(10)).isEqualTo(five.times(2));
        assertThat(Money.france(15)).isEqualTo(five.times(3));
    }

    @Test
    public void testEquality() {
        assertEquals(Money.dollar(5), Money.dollar(5));
        assertNotEquals(Money.france(5), Money.france(6));
        assertNotEquals(Money.france(5), Money.dollar(5));
    }

    @Test
    public void testCurrency() {
        assertThat("USD").isEqualTo(Money.dollar(1).currency);
        assertThat("CHF").isEqualTo(Money.france(1).currency);
    }

    @Test
    public void testSimpleAddition() {
        Money five = Money.dollar(5);
        Expression result = five.plus(five);
        Sum sum = (Sum) result;
        assertThat(five).isEqualTo(sum.augend);
        assertThat(five).isEqualTo(sum.addend);
    }

    @Test
    public void testReduceSum() {
        Expression sum = new Sum(Money.dollar(3), Money.dollar(4));
        Bank bank = new Bank();
        Money result = bank.reduce(sum, "USD");
        assertThat(Money.dollar(7)).isEqualTo(result);
    }

    @Test
    public void testReduceMoney() {
        Bank bank = new Bank();
        Money result = bank.reduce(Money.dollar(1), "USD");
        assertThat(Money.dollar(1)).isEqualTo(result);
    }
}
