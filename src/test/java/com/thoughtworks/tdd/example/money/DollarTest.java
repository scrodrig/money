package com.thoughtworks.tdd.example.money;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class DollarTest {

    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        assertThat(product.amount, equalTo(10));
        product = five.times(3);
        assertThat(product.amount, equalTo(15));
    }
}
