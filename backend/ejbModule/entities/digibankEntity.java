package entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="digibank_tbl")
public class digibankEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) 	
	private String name;
	private String SourcePassport;
	private String DestinationPassport;
	private String DestinationBank;
	private String DestinationCountry;
	private Integer AccountNumber;
	private Integer Amount;
	private String TransactionCode;
	
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	
	public String getSourcePassport() {
		return SourcePassport;
	}
	public void setSourcePassport(String SourcePassport) {
		this.SourcePassport = SourcePassport;
	}
	
	public String getDestinationPassport() {
		return DestinationPassport;
	}
	public void setDestinationPassport(String DestinationPassport) {
		this.DestinationPassport = DestinationPassport;
	}
	
	public String getDestinationBank() {
		return DestinationBank;
	}
	public void setDestinationBank(String DestinationBank) {
		this.DestinationBank = DestinationBank;
	}

	
	public String getDestinationCountry() {
		return DestinationCountry;
	}
	public void setDestinationCountry(String DestinationCountry) {
		this.DestinationCountry = DestinationCountry;
	}
	
	public Integer getAccountNumber() {
		return AccountNumber;
	}
	public void setAccountNumber(Integer AccountNumber) {
		this.AccountNumber = AccountNumber;
	}
	
	public Integer getAmount() {
		return Amount;
	}
	
	public void setAmount(Integer Amount) {
		this.Amount = Amount;
	}
	
	public String getTransactionCode() {
		return TransactionCode;
	}
	public void setTransactionCode(String Amount) {
		this.TransactionCode = TransactionCode;
	}
}
