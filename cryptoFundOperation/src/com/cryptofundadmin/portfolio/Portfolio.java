package com.cryptofundadmin.portfolio;

import java.util.Map;

import com.cryptofundadmin.def.Coin;
import com.cryptofundadmin.tran.Transaction;

public class Portfolio {
	
	private Integer id;
	private String name;
	private Map<Coin,Transaction> unspendTx;
}
