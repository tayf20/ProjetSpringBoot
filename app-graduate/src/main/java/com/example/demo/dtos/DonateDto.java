package com.example.demo.dtos;


public class DonateDto {
	
	private String donatorname;
	
	private String donatoremail;
	
	private int total;
	
	private int idchild;

	public DonateDto() {
		super();
	}

	public DonateDto(String donatorname, String donatoremail, int total, int idchild) {
		super();
		this.donatorname = donatorname;
		this.donatoremail = donatoremail;
		this.total = total;
		this.idchild = idchild;
	}

	public String getDonatorname() {
		return donatorname;
	}

	public void setDonatorname(String donatorname) {
		this.donatorname = donatorname;
	}

	public String getDonatoremail() {
		return donatoremail;
	}

	public void setDonatoremail(String donatoremail) {
		this.donatoremail = donatoremail;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getIdchild() {
		return idchild;
	}

	public void setIdchild(int idchild) {
		this.idchild = idchild;
	}	
}
