package ac.dia;

public class Measurement {

		private short weightSize;
		private double waistSize;
		private String partOfTheDay;
		
		public Measurement(short weightSize, double waistSize, String partOfTheDay) {
			super();
			this.weightSize = weightSize;
			this.waistSize = waistSize;
			this.partOfTheDay = partOfTheDay;
		}

		public short getWeightSize() {
			return weightSize;
		}
		
		public void setWeightSize(short weightSize) {
			this.weightSize = weightSize;
		}
		
		public double getWaistSize() {
			return waistSize;
		}
		
		public void setWaistSize(double waistSize) {
			this.waistSize = waistSize;
		}
		
		public String getPartOfTheDay() {
			return partOfTheDay;
		}
		
		public void setPartOfTheDay(String partOfTheDay) {
			this.partOfTheDay = partOfTheDay;
		}
		
		public void show() {
			System.out.println(" Weight Size: " + getWeightSize());
			System.out.println(" Waist Size: " + getWaistSize());
			System.out.println(" Part of the day: " + getPartOfTheDay());
		}
}
