package ac.dia;

public class Exercise {
	
	private int exerciesid;
	private String exerciesName;
	private byte exerciesSet;
	private byte exerciesRound;
	
	public Exercise(int exerciesid, String exerciesName, byte exerciesSet, byte exerciesRound) {
		super();
		this.exerciesid = exerciesid;
		this.exerciesName = exerciesName;
		this.exerciesSet = exerciesSet;
		this.exerciesRound = exerciesRound;
	}

	public int getExerciesid() {
		return exerciesid;
	}
	
	public void setExerciesid(int exerciesid) {
		this.exerciesid = exerciesid;
	}
	
	public String getExerciesName() {
		return exerciesName;
	}
	
	public void setExerciesName(String exerciesName) {
		this.exerciesName = exerciesName;
	}
	
	public byte getExerciesSet() {
		return exerciesSet;
	}
	
	public void setExerciesSet(byte exerciesSet) {
		this.exerciesSet = exerciesSet;
	}
	
	public byte getExerciesRound() {
		return exerciesRound;
	}
	
	public void setExerciesRound(byte exerciesRound) {
		this.exerciesRound = exerciesRound;
	}
	
	public void show() {
		System.out.println(" Exercies Id: " + getExerciesid());
		System.out.println(" Exercies Name: " + getExerciesName());
		System.out.println(" Exercies Set: " + getExerciesSet());
		System.out.println(" Exercies Round: " + getExerciesRound());
	}
	
	
}
