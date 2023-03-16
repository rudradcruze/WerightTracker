package ac.dia;

import java.util.Date;

public class User {

	private int id;
	private String userName;
	private String email;
	private String phoneNumber;
	private float weight;
	private float height;
	private Date date;
	private String address;
	
	public User(int id, String userName, String email, String phoneNumber, float weight, float height, Date date,
			String address) {
		super();
		this.id = id;
		this.userName = userName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.weight = weight;
		this.height = height;
		this.date = date;
		this.address = address;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public void login() {}
	public void logOut() {};
	
		
	public void show() {
		System.out.println(" id                   :  " + getId());
		System.out.println(" Tainer Eame   :  " + getUserName());
		System.out.println(" Email             :  " + getEmail());
		System.out.println(" Date              :  " + getDate());
		System.out.println(" Height           :  " + getHeight());
		System.out.println(" Weight          :  " + getWeight());
		System.out.println(" Phone           :  " + getPhoneNumber());
		System.out.println(" Address        :  " + getAddress());
	}
	
}
