package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// BMI calculation program

		double height;
		double weight;
		String name;
		double bmi;
		String type;
		String answer;
		Scanner keyboard;

		keyboard = new Scanner(System.in);

		System.out.println("Name: ");
		name = keyboard.nextLine();
		System.out.println("Height: ");
		height = Double.parseDouble(keyboard.nextLine());
		System.out.println("Weight: ");
		weight = Double.parseDouble(keyboard.nextLine());
		keyboard.close();

		bmi = weight / (height * height);

		if (bmi < 18.5) {
			type = "underweight.";
		} else if (bmi > 18.5 && bmi < 24.9) {
			type = "healthy weight.";
		} else if (bmi > 25.0 && bmi < 29.9) {
			type = "overweight.";
		} else if (bmi > 30 && bmi < 34.9) {
			type = "class 1 obesity.";
		} else if (bmi > 35 && bmi < 39.9) {
			type = "class 2 obesity.";
		} else
			type = "class 3 obesity.";

		answer = "Hello " + name + ", your BMI is " + bmi + " kg/m2. Considered: " + type;
		System.out.println(answer);
	}
}