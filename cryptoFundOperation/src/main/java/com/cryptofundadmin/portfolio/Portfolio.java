package com.cryptofundadmin.portfolio;

import java.util.Map;

import com.cryptofundadmin.def.Coin;
import com.cryptofundadmin.tran.Transaction;

public class Portfolio {
	
	private Integer id;
	private String name;
	
	// FIXME maybe transient with. A method may fill it asynchroniously. Will be decided after db shcema.
	private Map<Coin,Transaction> unspendTx;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Map<Coin, Transaction> getUnspendTx() {
		return unspendTx;
	}
	public void setUnspendTx(Map<Coin, Transaction> unspendTx) {
		this.unspendTx = unspendTx;
	}
	
	
	
}
