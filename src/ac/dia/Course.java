package ac.dia;

public class Course {

	private int courseId;
	private String courseTitle;
	private String courseLevel;
	private double coursePrice;
	private String courseDuration;
	private String courseDetails;
	
	public Course(int courseId, String courseTitle, String courseLevel, double coursePrice, String courseDuration,
			String courseDetails) {
		super();
		this.courseId = courseId;
		this.courseTitle = courseTitle;
		this.courseLevel = courseLevel;
		this.coursePrice = coursePrice;
		this.courseDuration = courseDuration;
		this.courseDetails = courseDetails;
	}

	public int getCourseId() {
		return courseId;
	}
	
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	
	public String getCourseTitle() {
		return courseTitle;
	}
	
	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}
	
	public String getCourseLevel() {
		return courseLevel;
	}
	
	public void setCourseLevel(String courseLevel) {
		this.courseLevel = courseLevel;
	}
	
	public double getCoursePrice() {
		return coursePrice;
	}
	
	public void setCoursePrice(double coursePrice) {
		this.coursePrice = coursePrice;
	}
	
	public String getCourseDuration() {
		return courseDuration;
	}
	
	public void setCourseDuration(String courseDuration) {
		this.courseDuration = courseDuration;
	}
	
	public String getCourseDetails() {
		return courseDetails;
	}
	
	public void setCourseDetails(String courseDetails) {
		this.courseDetails = courseDetails;
	}
	
	public void show() {
		System.out.println(" Course Id: " + getCourseId());
		System.out.println(" Course Title: " + getCourseTitle());
		System.out.println(" Course Level: " + getCourseLevel());
		System.out.println(" Course Price: " + getCoursePrice());
		System.out.println(" Course Duration: " + getCourseDuration());
		System.out.println(" Course Details: " +  getCourseDetails());
	}
}
