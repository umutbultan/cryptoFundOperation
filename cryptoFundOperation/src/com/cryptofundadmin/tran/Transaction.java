package com.cryptofundadmin.tran;

import java.math.BigDecimal;
import java.util.Date;

import com.cryptofundadmin.def.Coin;
import com.cryptofundadmin.def.Market;

public class Transaction {
	
	private Long txId;
	private Date txDate;
	private Coin coin;
	private BigDecimal amount;
	private BigDecimal price;
	private Short txType;
	private Market market;
	private Commision com;
	public Long getTxId() {
		return txId;
	}
	public void setTxId(Long txId) {
		this.txId = txId;
	}
	public Date getTxDate() {
		return txDate;
	}
	public void setTxDate(Date txDate) {
		this.txDate = txDate;
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
	public Short getTxType() {
		return txType;
	}
	public void setTxType(Short txType) {
		this.txType = txType;
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
