package ac.dia;

import java.util.Date;

public class Trainee extends User{
	
	private String bodyShape;
	
	public Trainee(int id, String userName, String email, String phoneNumber, float weight, float height, Date date,
			String address, String bodyShape) {
		super(id, userName, email, phoneNumber, weight, height, date, address);
		this.bodyShape = bodyShape;
	}

	public String getBodyShape() {
		return bodyShape;
	}

	public void setBodyShape(String bodyShape) {
		this.bodyShape = bodyShape;
	}
	
	public void view() {
		show();
		System.out.println(" Trainer Expertices  :  " + getBodyShape());
	}
	
}
