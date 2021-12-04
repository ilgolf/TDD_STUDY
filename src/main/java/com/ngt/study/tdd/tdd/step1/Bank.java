package com.ngt.study.tdd.tdd.step1;

public class Bank {

    Money reduce(Expression source, String to) {
        Sum sum = (Sum) source;
        return sum.reduce(to);
    }
}
