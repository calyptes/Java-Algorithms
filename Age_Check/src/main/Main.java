package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Age check program

		Scanner keyboard;
		String name;
		int age;
		String answer;

		keyboard = new Scanner(System.in);
		answer = "";

		System.out.println("Enter name: ");
		name = keyboard.nextLine();
		System.out.println("Enter age: ");
		age = Integer.parseInt(keyboard.nextLine());

		keyboard.close();

		if (age > 17) {
			answer = "an adult.";
		} else {
			answer = "a minor.";
		}

		System.out.println("Hello " + name + ", you are " + answer);
	}
}