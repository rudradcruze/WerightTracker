package ac.dia;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		
		// User user = new User();
		Trainer trainer = new Trainer(990, "Francis Rudra D Cruze", "francisrudra@gmail.com", "+8801870179066", 73f, 5.10f, new Date(), "Sukrabad, Dhaka", "Biceps");
		trainer.view();
		
		Trainee trainee = new Trainee(1007, "John Hossain", "john@gmail.com", "+8801870179066", 89, 8.2f, new Date(), "Framgate, Dhaka", "Bulky");
		
		trainee.view();
	}

}
