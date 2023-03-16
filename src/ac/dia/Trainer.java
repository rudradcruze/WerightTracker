package ac.dia;

import java.util.Date;

public class Trainer {
	
	private String trainerExperties;
	private Date startTime;
	private Date endTime;

	public Trainer(String trainerExperties, Date startTime, Date endTime) {
		super();
		this.trainerExperties = trainerExperties;
		this.startTime = startTime;
		this.endTime = endTime;
	}

	public String getTrainerExperties() {
		return trainerExperties;
	}
	
	public void setTrainerExperties(String trainerExperties) {
		this.trainerExperties = trainerExperties;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public void show() {
		System.out.println(" Expertices:  " + getTrainerExperties());
		System.out.println(" Start Time: " + getStartTime());
		System.out.println(" End Time: " + getEndTime());
	}
	
}
