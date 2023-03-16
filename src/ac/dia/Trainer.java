package ac.dia;

import java.util.Date;

public class Trainer extends User {
	
	private String trainerExperties;
	
	public Trainer(int id, String userName, String email, String phoneNumber, float weight, float height, Date date,
			String address, String trainerExperties) {
		super(id, userName, email, phoneNumber, weight, height, date, address);
		this.trainerExperties = trainerExperties;
	}

	public String getTrainerExperties() {
		return trainerExperties;
	}
	
	public void setTrainerExperties(String trainerExperties) {
		this.trainerExperties = trainerExperties;
	}

	public void view() {
		show();
		System.out.println(" Expertices        :  " + getTrainerExperties());
	}
	
}
