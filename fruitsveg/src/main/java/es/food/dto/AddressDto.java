package es.food.dto;

import java.io.Serializable;
import java.util.UUID;





public class AddressDto implements Serializable{	
	
		
	    private UUID id;	   
	    private String street;	  
	    private String number;	  
	    private String city;	  
	    private String country;	   
	    private String zipcode;

	   

	public UUID getId() {
			return id;
		}



		public void setId(UUID id) {
			this.id = id;
		}



		public String getStreet() {
			return street;
		}



		public void setStreet(String street) {
			this.street = street;
		}



		public String getNumber() {
			return number;
		}



		public void setNumber(String number) {
			this.number = number;
		}



		public String getCity() {
			return city;
		}



		public void setCity(String city) {
			this.city = city;
		}



		public String getCountry() {
			return country;
		}



		public void setCountry(String country) {
			this.country = country;
		}



		public String getZipcode() {
			return zipcode;
		}



		public void setZipcode(String zipcode) {
			this.zipcode = zipcode;
		}



	private static final long serialVersionUID = 1L;
}
