package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Annual income calculator program

		String name;
		String surname;
		String gender;
		double averageSalary;
		int monthlyPayments;
		double annualSalary;
		String answer;
		Scanner keyboard;

		keyboard = new Scanner(System.in);

		System.out.println("Enter name: ");
		name = keyboard.nextLine();
		System.out.println("Enter surname: ");
		surname = keyboard.nextLine();
		System.out.println("Enter gender: F/M ");
		gender = keyboard.nextLine();

		if (gender.equalsIgnoreCase("F")) {
			gender = "mrs. ";
		} else if (gender.equalsIgnoreCase("M")) {
			gender = "mr. ";
		}

		System.out.println("Enter average salary: ");
		averageSalary = Double.parseDouble(keyboard.nextLine());
		System.out.println("Enter monthly payments: ");
		monthlyPayments = Integer.parseInt(keyboard.nextLine());
		keyboard.close();

		annualSalary = averageSalary * monthlyPayments;

		answer = "Hello " + gender + name + " " + surname + ", your annual salary is " + annualSalary + "$.";
		System.out.println(answer);
	}

}