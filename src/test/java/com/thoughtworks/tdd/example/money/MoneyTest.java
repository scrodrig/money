package com.thoughtworks.tdd.example.money;

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
}