package ac.dia;

import java.util.Date;

public class DailyMeal {
	
	private Date mealDate;
	private String partOfTheDay;
	
	// Method
	public void setMissingMeal() {};


	public Date getMealDate() {
		return mealDate;
	}
	
	public void setMealDate(Date mealDate) {
		this.mealDate = mealDate;
	}
	
	public String getPartOfTheDay() {
		return partOfTheDay;
	}
	
	public void setPartOfTheDay(String partOfTheDay) {
		this.partOfTheDay = partOfTheDay;
	}
	
	public void view() {
		System.out.println("Meal date: " +  getMealDate());
		System.out.println("Meal part of the day: " +  getPartOfTheDay());
	}
}
