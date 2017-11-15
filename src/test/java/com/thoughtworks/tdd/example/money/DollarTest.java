package com.thoughtworks.tdd.example.money;

import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static junit.framework.Assert.assertTrue;

public class DollarTest {

    @Test
    public void shouldReturnTheRightValueWhenYouMultiplyTheAmount() {
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        assertThat(product.amount, equalTo(10));
    }

    @Test
    public void shouldNotAlterateWhenMultiplyTheAmountAgain() {
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        assertThat(product.amount, equalTo(10));
        product = five.times(3);
        assertThat(product.amount, equalTo(15));
    }

    @Test
    public void shouldBeTrueWhenADollarEqualToAnother() {
        Dollar five = new Dollar(5);
        Dollar anotherFive = new Dollar(5);
        assertTrue(five.equals(anotherFive));
    }

    @Test
    public void shouldBeFalseWhenADollarIsNotEqualToAnother() {
        Dollar five = new Dollar(5);
        Dollar six = new Dollar(6);
        assertFalse(five.equals(six));
    }

}
