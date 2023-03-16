package ac.dia;

public class Trainee {
	
	private double height;
	private byte age;
	private short weight;
	
	public Trainee(double height, byte age, short weight) {
		super();
		this.height = height;
		this.age = age;
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public byte getAge() {
		return age;
	}
	
	public void setAge(byte age) {
		this.age = age;
	}
	
	public short getWeight() {
		return weight;
	}
	
	public void setWeight(short weight) {
		this.weight = weight;
	}
	
	public void show() {
		System.out.println(" Height: " + getHeight());
		System.out.println(" Weight: " + getWeight());
		System.out.println(" Age: " + getAge());
	}
	
}
