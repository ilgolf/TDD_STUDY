package com.ngt.study.tdd.tdd.step1;

public class Money implements Expression {

    protected int amount;
    protected String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    static Money dollar(int amount) {
        return new Money(amount, "USD");
    }

    static Money france(int amount) {
        return new Money(amount, "CHF");
    }

    Money times(int multiplier) {
        return new Money(amount * multiplier, currency);
    }

    String currency() {
        return currency;
    }

    Expression plus(Money addend) {
        return new Sum(this, addend);
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
