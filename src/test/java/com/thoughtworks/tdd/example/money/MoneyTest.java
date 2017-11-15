package com.thoughtworks.tdd.example.money;

import org.junit.Test;

import static org.junit.Assert.*;

public class MoneyTest {

    @Test
    public void shouldNotBeEqualFrancAndDollar() throws Exception {
        Franc franc = new Franc(5);
        Dollar dollar = new Dollar(5);
        assertFalse(franc.equals(dollar));
    }
}