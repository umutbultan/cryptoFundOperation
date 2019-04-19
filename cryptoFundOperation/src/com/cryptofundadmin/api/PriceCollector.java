package com.cryptofundadmin.api;

import com.cryptofundadmin.def.Coin;

import java.math.BigDecimal;

public interface PriceCollector {

        BigDecimal getSingleCoinPrice(Coin coin);


}
