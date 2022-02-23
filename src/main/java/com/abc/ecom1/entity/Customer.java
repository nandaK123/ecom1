package com.abc.ecom1.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name = "Customer")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "customerid")
	private int customerid;

	@ApiModelProperty(notes = "ID of the customer", name = "customerId", required = false, value = "Auto generated")
	public int getCustomerid() {
		return customerid;
	}

	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	@ApiModelProperty(notes = "Email of the customer", name = "email", required = true, value = "test email")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@ApiModelProperty(notes = "Mobile Number of the customer", name = "mobile", required = true, value = "Accept only 10 digits")
	public int getMobileno() {
		return mobileno;
	}

	public void setMobileno(int mobileno) {
		this.mobileno = mobileno;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "customername")
	private String customername;
	@Column(name = "email")
	private String email;

	@Column(name = "mobileno")
	private int mobileno;
	@Column(name = "address")
	private String address;

}
