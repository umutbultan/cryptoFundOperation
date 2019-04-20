package com.cryptofundadmin.tran;

import java.math.BigDecimal;

public class Commision {

	private Long id;
	private BigDecimal totalAmount;
	private BigDecimal incentive;
	private BigDecimal marketCom;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public BigDecimal getIncentive() {
		return incentive;
	}
	public void setIncentive(BigDecimal incentive) {
		this.incentive = incentive;
		setTotalAmount();
	}
	public BigDecimal getMarketCom() {
		return marketCom;
	}
	public void setMarketCom(BigDecimal marketCom) {
		this.marketCom = marketCom;
		setTotalAmount();
	}
	public BigDecimal getTotalAmount() {
		return totalAmount;
	}
	
	private void setTotalAmount(){
		this.totalAmount = (this.incentive!=null ? this.incentive : BigDecimal.ZERO ).add( (this.marketCom!=null ? this.marketCom : BigDecimal.ZERO ) );
	}
	
	
	
}
