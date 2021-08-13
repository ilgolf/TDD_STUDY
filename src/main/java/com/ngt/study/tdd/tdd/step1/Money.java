package com.ngt.study.tdd.tdd.step1;

public class Money {

    protected int amount;
    protected String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    static Dollar dollar(int amount) {
        return new Dollar(amount, "USD");
    }

    static France france(int amount) {
        return new France(amount, "CHF");
    }

    Money times(int multiplier) {
        return new Money(amount * multiplier, currency);
    }

    String currency() {
        return currency;
    }

    public boolean equals(Object o) {
        Money money = (Money) o;
        return this.amount == money.amount &&
                currency.equals(money.currency);
    }

    public String toString() {
        return amount + " " + currency;
    }
}
