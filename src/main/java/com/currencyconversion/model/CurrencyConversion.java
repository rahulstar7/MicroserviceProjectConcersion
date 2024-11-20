package com.currencyconversion.model;

import java.math.BigDecimal;

public class CurrencyConversion {

	private Long id;
	
	private String from;
	
	private String to;
	
	private BigDecimal quantity;
	
	private BigDecimal conversionMulti;
	
	private BigDecimal totalConversion;
	
	private String env;

	/**
	 * @param id
	 * @param from
	 * @param to
	 * @param quantity
	 * @param conversionMulti
	 * @param totalConversion
	 * @param env
	 */
	public CurrencyConversion(Long id, String from, String to, BigDecimal quantity, BigDecimal conversionMulti,
			BigDecimal totalConversion, String env) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.quantity = quantity;
		this.conversionMulti = conversionMulti;
		this.totalConversion = totalConversion;
		this.env = env;
	}

	/**
	 * 
	 */
	public CurrencyConversion() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the from
	 */
	public String getFrom() {
		return from;
	}

	/**
	 * @param from the from to set
	 */
	public void setFrom(String from) {
		this.from = from;
	}

	/**
	 * @return the to
	 */
	public String getTo() {
		return to;
	}

	/**
	 * @param to the to to set
	 */
	public void setTo(String to) {
		this.to = to;
	}

	/**
	 * @return the quantity
	 */
	public BigDecimal getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	/**
	 * @return the conversionMulti
	 */
	public BigDecimal getConversionMulti() {
		return conversionMulti;
	}

	/**
	 * @param conversionMulti the conversionMulti to set
	 */
	public void setConversionMulti(BigDecimal conversionMulti) {
		this.conversionMulti = conversionMulti;
	}

	/**
	 * @return the totalConversion
	 */
	public BigDecimal getTotalConversion() {
		return totalConversion;
	}

	/**
	 * @param totalConversion the totalConversion to set
	 */
	public void setTotalConversion(BigDecimal totalConversion) {
		this.totalConversion = totalConversion;
	}

	/**
	 * @return the env
	 */
	public String getEnv() {
		return env;
	}

	/**
	 * @param env the env to set
	 */
	public void setEnv(String env) {
		this.env = env;
	}

	@Override
	public String toString() {
		return "CurrencyConversion [id=" + id + ", from=" + from + ", to=" + to + ", quantity=" + quantity
				+ ", conversionMulti=" + conversionMulti + ", totalConversion=" + totalConversion + ", env=" + env
				+ "]";
	}
	
	
	
	
}
