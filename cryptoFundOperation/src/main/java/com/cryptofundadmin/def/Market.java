package com.cryptofundadmin.def;

import java.util.List;

public class Market {

	private Integer id;
	private String marketName;
	private List<Coin> activeCoins;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMarketName() {
		return marketName;
	}
	public void setMarketName(String marketName) {
		this.marketName = marketName;
	}
	
	
}
