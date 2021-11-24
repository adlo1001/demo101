package et.demo.model;

import javax.persistence.Embeddable;

@Embeddable
public class Address {

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(String houseNo, String streetNo, String city) {
		super();
		this.houseNo = houseNo;
		this.streetNo = streetNo;
		this.city = city;
	}

	private String houseNo;
	private String streetNo;
	private String city;

	public String getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	public String getStreetNo() {
		return streetNo;
	}

	public void setStreetNo(String streetNo) {
		this.streetNo = streetNo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
