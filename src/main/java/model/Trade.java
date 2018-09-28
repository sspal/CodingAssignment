package model;

import java.util.Date;
import java.util.Random;

public class Trade {
	/**
	 * random generated tradeid
	 */
	private final long tradeId;
	/**
	 * tradeEntity
	 */
	private final String tradeEntity;
	/**
	 * instructDate
	 */
	private final Date instructDate;
	/**
	 * intendedSettlementDate
	 */
	private final Date intendedSettlementDate;
	/**
	 * currency
	 */
	private final String currency;
	/**
	 * fxRate
	 */
	private final float fxRate;
	/**
	 * units
	 */
	private final long units;
	/**
	 * tradeType
	 */
	private final String tradeType;
	/**
	 * unitPrice
	 */
	private double unitPrice;
	
	Random rand = new Random(); 
	/**
	 * Constructor to set object
	 * @param tradeEntity
	 * @param instructDate
	 * @param intendedSettlementDate
	 * @param currency
	 * @param fxRate
	 * @param units
	 * @param tradeType
	 * @param unitPrice
	 */
	public Trade(String tradeEntity, Date instructDate, 
			Date intendedSettlementDate, String currency, float fxRate,
			long units, String tradeType, double unitPrice) {
		long rand_long = rand.nextLong(); 
		this.tradeId = rand_long;
		this.tradeEntity = tradeEntity;
		this.instructDate = instructDate;
		this.intendedSettlementDate = intendedSettlementDate;
		this.currency = currency;
		this.fxRate = fxRate;
		this.units = units;
		this.tradeType = tradeType;
		this.unitPrice = unitPrice;
	}


	public long getTradeId() {
		return tradeId;
	}


	public String getTradeEntity() {
		return tradeEntity;
	}


	public Date getInstructDate() {
		return instructDate;
	}


	public Date getIntendedSettlementDate() {
		return intendedSettlementDate;
	}


	public String getCurrency() {
		return currency;
	}


	public float getFxRate() {
		return fxRate;
	}


	public long getUnits() {
		return units;
	}


	public String getTradeType() {
		return tradeType;
	}


	public double getUnitPrice() {
		return unitPrice;
	}

	
}
