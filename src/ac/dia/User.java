package ac.dia;

import java.util.Date;

public class User {

	private int id;
	private String userName;
	private String email;
	private String phoneNumber;
	private String address;
	private Date date;

	public User(int id, String userName, String email, String phoneNumber, String address, Date date) {
		super();
		this.id = id;
		this.userName = userName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.date = date;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public void login() {}
	public void logOut() {};
	
	public void show() {
		System.out.println(" id:  " + getId());
		System.out.println(" Name:  " + getUserName());
		System.out.println(" Email:  " + getEmail());
		System.out.println(" Phone:  " + getPhoneNumber());
		System.out.println(" Address:  " + getAddress());
		System.out.println(" Date:  " + getDate());
	}
	
}
