package com.cryptofundadmin.api;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

public class BitfinexPriceCollectorTest {

    BitfinexPriceCollector collector;

    @Before
    public void setUp() throws Exception {
        collector = new BitfinexPriceCollector();
    }

    @Test
    public void getSingleCoinPriceTest() {
        assert   collector.getSingleCoinPrice( null ).equals( BigDecimal.ZERO);
    }
}
