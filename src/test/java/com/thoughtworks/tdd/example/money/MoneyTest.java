package com.thoughtworks.tdd.example.money;

import junit.framework.Assert;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

import static junit.framework.Assert.assertTrue;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;

public class MoneyTest {

    @Test
    public void shouldNotBeEqualFrancAndDollar() throws Exception {
        Money franc = Money.franc(5);
        Money dollar = Money.dollar(5);
        assertFalse(franc.equals(dollar));
    }

    @Test
    public void shouldBeEqualWhenCurrencyIsRequestedForDollars(){
        assertThat(Money.dollar(1).currency(), is("USD"));
    }

    @Test
    public void shouldBeEqualWhenCurrencyIsRequestedForFrancs(){
        assertThat(Money.franc(1).currency(), is("CHF"));
    }

    @Test
    public void shouldNotBeTrueWhenAmountAndCurrencyAreEqual() {
        assertFalse(new Money(10, "CHF").equals(new Money(10, "USD")));
    }

    @Test
    public void shouldReturnTheRightValueWhenYouMultiplyTheAmount() {
        Money five = Money.dollar(5);
        Money product = five.times(2);
        MatcherAssert.assertThat(product, Matchers.is(Money.dollar(10)));
    }

    @Test
    public void shouldReturnTheRightValueWhenMultiplyTheAmountAgain() {
        Money five = Money.dollar(5);
        Money ten = Money.dollar(10);
        Money fifteen = Money.dollar(15);
        MatcherAssert.assertThat(ten, Matchers.is(five.times(2)));
        MatcherAssert.assertThat(fifteen, Matchers.is(five.times(3)));
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
        Assert.assertFalse(five.equals(six));
    }

}