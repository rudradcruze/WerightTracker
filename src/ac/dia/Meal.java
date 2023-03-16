package ac.dia;

public class Meal {
	
	private int mealid;
	private String mealIteamName;
	private int calloryTotal;
	private short weightGram;

	// Method
	public void caloryPerItem() {}
	
	public Meal(int mealid, String mealIteamName, int calloryTotal, short weightGram) {
		super();
		this.mealid = mealid;
		this.mealIteamName = mealIteamName;
		this.calloryTotal = calloryTotal;
		this.weightGram = weightGram;
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

	public int getCalloryTotal() {
		return calloryTotal;
	}

	public void setCalloryTotal(int calloryTotal) {
		this.calloryTotal = calloryTotal;
	}

	public short getWeightGram() {
		return weightGram;
	}

	public void setWeightGram(short weightGram) {
		this.weightGram = weightGram;
	}
	
	public void show() {
		System.out.println(" Meal id: " + getMealid());
		System.out.println(" Meal Item: " + getMealIteamName());
		System.out.println(" Meal calory toal: " + getCalloryTotal());
		System.out.println(" Meal weight: " + getWeightGram());
	}
	
}
