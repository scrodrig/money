package com.thoughtworks.tdd.example.money;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class OperationsTest {

    @Test
    public void shouldReturnAnSimpleAdditionWithChangeRates() {
        Money five  = Money.dollar(5);
        Expression sum = five.plus(five);
        Bank bank  = new Bank();
        Money reduced  = bank.reduce(sum, "USD");
        assertThat(reduced, is(Money.dollar(10)));
    }
}
