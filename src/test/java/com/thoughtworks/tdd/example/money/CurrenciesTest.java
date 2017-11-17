package com.thoughtworks.tdd.example.money;

import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class CurrenciesTest {

    @Test
    public void shouldReturnTheRightValueWhenYouMultiplyTheAmount() {
        Money five = Money.dollar(5);
        Money product = five.times(2);
        assertThat(product, is(Money.dollar(10)));
    }

    @Test
    public void shouldReturnTheRightValueWhenMultiplyTheAmountAgain() {
        Money five = Money.dollar(5);
        Money ten = Money.dollar(10);
        Money fifteen = Money.dollar(15);
        assertThat(ten, is(five.times(2)));
        assertThat(fifteen, is(five.times(3)));
    }

    @Test
    public void shouldBeTrueWhenADollarEqualToAnother() {
        Money five = Money.dollar(5);
        Money anotherFive = Money.dollar(5);
        assertTrue(five.equals(anotherFive));
    }

    @Test
    public void shouldBeFalseWhenADollarIsNotEqualToAnother() {
        Money five = Money.dollar(5);
        Money six = Money.dollar(6);
        assertFalse(five.equals(six));
    }



}
