import java.util.Scanner;

public class BMICalculator {
	private float height;
	private float weight;
	private int option;
	private float BMI;
	
	public void readUserData() {
		Scanner sc = new Scanner(System.in);
		menu();
		System.out.println("What is your height?");
		if (this.option == 1) {
			System.out.println("(In Inches)");
		} else {
			System.out.println("(In Meters)");
		}
		this.height = sc.nextFloat();
		while (this.height < 1) {
			System.out.println("Please input a reasonable number");
			this.height = sc.nextFloat();
		}
		System.out.println("What is your weight?");
		if (this.option == 1) {
			System.out.println("(In Pounds)");
		} else {
			System.out.println("(In Kilograms)");
		}
		this.weight = sc.nextFloat();
		while (this.weight < 1) {
			System.out.println("Please input a reasonable number");
			this.weight = sc.nextFloat();
		}
	}
	
	public void calculateBmi() {
		if (this.option == 1) {
			this.BMI = readImperialData();
		} else if (this.option == 2) {
			this.BMI = readMetricData();
		}
	}
	
	private float readImperialData() {
		return 703 * this.weight / (this.height * this.height);
	}
	
	private float readMetricData() {
		return this.weight / (this.height * this.height);
	}
	
	public void setBMI(float BMI) {
		this.BMI = BMI;
	}
	
	public void displayBmi() {
		System.out.printf("Your BMI is %3.1f%n", this.BMI);
		if (this.BMI < 18.5) {
			System.out.println("You are underweight");
		} else if (this.BMI < 25) {
			System.out.println("You are normal weight");
		} else if (this.BMI < 30) {
			System.out.println("You are overweight");
		} else {
			System.out.println("You are at risk");
		}
	}
	
	public void menu() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Which would you prefer?");
		System.out.println("1) US Customary");
		System.out.println("2) Metric");
		this.option = scan.nextInt();
		while (this.option > 2 || this.option < 1) {
			System.out.println("Please input a valid option");
			this.option = scan.nextInt();
		}
	}
	
	public int getOption() {
		return this.option;
	}

	public float getHeight() {
		return this.height;
	}
	
	public float getWeight() {
		return this.weight;
	}
	
	public float getBMI() {
		return this.BMI;
	}
}
