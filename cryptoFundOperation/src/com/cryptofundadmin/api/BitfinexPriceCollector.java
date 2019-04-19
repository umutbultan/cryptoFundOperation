package com.cryptofundadmin.api;

import com.cryptofundadmin.def.Coin;
import java.math.BigDecimal;

public class BitfinexPriceCollector implements  PriceCollector{

    public BigDecimal getSingleCoinPrice(Coin coin){
        return BigDecimal.ZERO;
    }


}
