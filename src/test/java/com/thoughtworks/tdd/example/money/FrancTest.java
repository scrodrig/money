package com.thoughtworks.tdd.example.money;

import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class FrancTest {

    @Test
    public void shouldBeTrueWhenAFrancEqualToAnother() {
        Franc five = new Franc(5);
        Franc anotherFive = new Franc(5);
        assertTrue(five.equals(anotherFive));
    }

    @Test
    public void shouldBeFalseWhenAFrancIsNotEqualToAnother() {
        Franc five = new Franc(5);
        Franc six = new Franc(6);
        assertFalse(five.equals(six));
    }

    @Test
    public void testFrancMultiplication() {
        Franc five= new Franc(5);
        assertThat(new Franc(10), is(five.times(2)));
        assertThat(new Franc(15), is(five.times(3)));
    }

}