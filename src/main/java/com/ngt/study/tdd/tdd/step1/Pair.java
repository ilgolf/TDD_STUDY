package com.ngt.study.tdd.tdd.step1;

public class Pair {

    private String from;
    private String to;

    public Pair(String from, String to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public int hashCode() {
        return 0;  // hashcode를 0으로 두면 해시 테이블에서 검색은 선형 검색과 비슷하게 수행될 것이다.
    }

    @Override
    public boolean equals(Object object) {
        Pair pair = (Pair) object;
        return from.equals(pair.from) && to.equals(pair.to);
    }
}
