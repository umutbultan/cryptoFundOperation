package com.cryptofundadmin.tran;

import java.math.BigDecimal;
import java.util.Date;

import com.cryptofundadmin.def.Coin;
import com.cryptofundadmin.def.Market;

public class Transaction {
	
	private Long trId;
	private Date trDate;
	private Coin coin;
	private BigDecimal amount;
	private BigDecimal price;
	private Short trType;
	private Market market;
	private Commision com;
	public Long getTrId() {
		return trId;
	}
	public void setTrId(Long trId) {
		this.trId = trId;
	}
	public Date getTrDate() {
		return trDate;
	}
	public void setTrDate(Date trDate) {
		this.trDate = trDate;
	}
	public Coin getCoin() {
		return coin;
	}
	public void setCoin(Coin coin) {
		this.coin = coin;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public Short getTrType() {
		return trType;
	}
	public void setTrType(Short trType) {
		this.trType = trType;
	}
	public Market getMarket() {
		return market;
	}
	public void setMarket(Market market) {
		this.market = market;
	}
	public Commision getCom() {
		return com;
	}
	public void setCom(Commision com) {
		this.com = com;
	}
	
	
}
