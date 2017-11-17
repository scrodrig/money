package com.thoughtworks.tdd.example.money;

import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class FrancTest {

    @Test
    public void shouldBeTrueWhenAFrancEqualToAnother() {
        Money five = Money.franc(5);
        Money anotherFive = Money.franc(5);
        assertTrue(five.equals(anotherFive));
    }

    @Test
    public void shouldBeFalseWhenAFrancIsNotEqualToAnother() {
        Money five = Money.franc(5);
        Money six = Money.franc(6);
        assertFalse(five.equals(six));
    }

    @Test
    public void shouldFrancMultiplicationsBeValid() {
        Money five= Money.franc(5);
        assertThat(Money.franc(10), is(five.times(2)));
        assertThat(Money.franc(15), is(five.times(3)));
    }

}