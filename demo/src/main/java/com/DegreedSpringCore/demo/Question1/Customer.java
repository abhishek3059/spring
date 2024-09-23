package com.DegreedSpringCore.demo.Question1;

public class Customer {
	private int custId;
	private String custName;
	private long custCont;
	private Address custAddress;
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public long getCustCont() {
		return custCont;
	}
	public void setCustCont(long custCont) {
		this.custCont = custCont;
	}
	public Address getCustAddress() {
		return custAddress;
	}
	public void setCustAddress(Address custAddress) {
		this.custAddress = custAddress;
	}
	@Override
	public String toString() {
		return "Customer details:\nCustomer Id:"+this.getCustId()+"\nCustomer name:"+this.getCustName()+"\nCustomer Contact:"+this.getCustCont()
					+"\nCustomer Address:\nStreet:"+this.getCustAddress().getStreet()+"\nCity:"+this.getCustAddress().getCity()+
					"\nState:"+this.getCustAddress().getState()+"\nZipCode:"+this.getCustAddress().getZipCode()+
					"\nCountry:"+this.getCustAddress().getCountry();
	}
	
}
