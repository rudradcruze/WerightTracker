package ac.dia;

public class Meal {
	
	private int mealid;
	private String mealIteamName;
	private short callory;
	
	public Meal(int mealid, String mealIteamName, short callory) {
		super();
		this.mealid = mealid;
		this.mealIteamName = mealIteamName;
		this.callory = callory;
	}

	public int getMealid() {
		return mealid;
	}
	
	public void setMealid(int mealid) {
		this.mealid = mealid;
	}
	
	public String getMealIteamName() {
		return mealIteamName;
	}
	
	public void setMealIteamName(String mealIteamName) {
		this.mealIteamName = mealIteamName;
	}
	
	public short getCallory() {
		return callory;
	}
	
	public void setCallory(short callory) {
		this.callory = callory;
	}
	
	
}
