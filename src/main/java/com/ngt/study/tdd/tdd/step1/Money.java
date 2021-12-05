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

    public Money times(int multiplier) {
        return new Money(amount * multiplier, currency);
    }

    String currency() {
        return currency;
    }

    public Expression plus(Expression addend) {
        return new Sum(this, addend);
    }

//    Expression times(int multiplier) {
//        return new Money(amount * multiplier, currency);
//    }

    public Money reduce(Bank bank, String to) {
        int rate = bank.rate(currency, to);

        return new Money(amount / rate, to);
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
