package com.thoughtworks.tdd.example.money;

import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class DollarTest {

    @Test
    public void shouldReturnTheRightValueWhenYouMultiplyTheAmount() {
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        assertThat(product, is(new Dollar(10)));
    }

    @Test
    public void shouldReturnTheRightValueWhenMultiplyTheAmountAgain() {
        Dollar five = new Dollar(5);
        Dollar ten = new Dollar(10);
        Dollar fifteen = new Dollar(15);
        assertThat(ten, is(five.times(2)));
        assertThat(fifteen, is(five.times(3)));
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

    @Test
    public void testFrancMultiplication() {
        Franc five= new Franc(5);
        assertThat(new Franc(10), is(five.times(2)));
        assertThat(new Franc(15), is(five.times(3)));
    }

}
