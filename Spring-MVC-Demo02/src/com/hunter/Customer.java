package com.hunter;

import java.util.LinkedHashMap;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
//import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Size;

public class Customer {
	
	private LinkedHashMap<String, String> countryList;
	private LinkedHashMap<String, String> favCuisineList;
	@Size(min = 3,message = "The name should be Eren Yeager or Hunter!!!")
	@Pattern(regexp 
			= "[a-zA-Z .]+",message="Name can only be Eren Yeager")
//	@Pattern(regexp = "^\\S+$", message="I already told you, only Eren is allowed")
//	@NotBlank(message="Reguired 3D - Manuever Gear ")
	@NotNull(message="Reguired 3D - Manuever Gear ")
	
	private String name;
	private String country;
	private String favCuisine;
	
//	@NotNull(message="Select at least one book")
	@javax.validation.constraints.NotEmpty(message="Select pannu da naaye")
	private String[] book;
	
	@NotNull
	@Min(value=0, message="cannot be less than 0")
	@Max(value=10, message="cannot be larger than 10")
	private int discountCoupons;
	

	public String getFavCuisine() {
		return favCuisine;
	}

	public void setFavCuisine(String favCuisine) {
		this.favCuisine = favCuisine;
	}

	public Customer() {
		countryList=new LinkedHashMap<String, String>();
		countryList.put("IN","India");
		countryList.put("KM","Kasimedu");
		countryList.put("RM","Royapuram");
		countryList.put("SJIT","Setha Naayae Ulla Varaadha");
		favCuisineList=new LinkedHashMap<String, String>();
		favCuisineList.put("french", "French");
		favCuisineList.put("chinese", "Chinese");
		favCuisineList.put("kozhi kulambu", "Kozhi Kulambu");
		favCuisineList.put("dosa", "Dosa");
		
	}
	
	
	public LinkedHashMap<String, String> getFavCuisineList() {
		return favCuisineList;
	}

	public LinkedHashMap<String, String> getCountryList() {
		return countryList;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String[] getBook() {
		return book;
	}

	public void setBook(String[] book) {
		this.book = book;
	}

	public int getDiscountCoupons() {
		return discountCoupons;
	}

	public void setDiscountCoupons(int discountCoupons) {
		this.discountCoupons = discountCoupons;
	}
}
