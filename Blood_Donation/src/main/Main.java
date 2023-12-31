package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Requirements for blood donation program

		Scanner keyboard;
		String name;
		int age; // >17, <66
		double weight; // >=50
		int donation; // 3 months
		boolean severeDisease; // no
		boolean infectiousDisease; // 15 days
		boolean dentalExtraction; // 1 month
		boolean surgery; // 4 months
		boolean pregnancy; //1 year
		int tattoosPiercing; // 6 months
		int transfusion; // 4 months
		boolean tropicsTrip; // 3 months
		boolean std; // no
		boolean drugs; // no
		boolean riskySexualActivity; // no

		keyboard = new Scanner(System.in);

		System.out.println("Enter name: ");
		name = keyboard.nextLine();
		System.out.println("Enter age: ");
		age = Integer.parseInt(keyboard.nextLine());

		if (age < 18 || age > 65) {
			System.out.println("You cannot donate.");
		} else {
			System.out.println("Enter weight: ");
			weight = Double.parseDouble(keyboard.nextLine());
			if (weight < 50) {
				System.out.println("You cannot donate.");
			} else {
				System.out.println("How many months ago did you last donate? ");
				donation = Integer.parseInt(keyboard.nextLine());
				if (donation < 3) {
					System.out.println("You cannot donate.");
				} else {
					System.out.println("Have you ever had a severe disease? true/false ");
					severeDisease = keyboard.nextBoolean();
					if (severeDisease == true) {
						System.out.println("You cannot donate.");
					} else {
						System.out.println(
								"Have you had an infectious disease or taken antibiotics in the last 2 weeks? true/false ");
						infectiousDisease = keyboard.nextBoolean();
						if (infectiousDisease == true) {
							System.out.println("You cannot donate.");
						} else {
							System.out.println("Have you undergone dental extractions in the last month? true/false ");
							dentalExtraction = keyboard.nextBoolean();
							if (dentalExtraction == true) {
								System.out.println("You cannot donate.");
							} else {
								System.out.println("Have you undergone surgery in the last 4 months? true/false ");
								surgery = keyboard.nextBoolean();
								if (surgery == true) {
									System.out.println("You cannot donate.");
								} else {
									System.out.println(
											"Are you pregnant or have you given birth in the last year? true/false ");
									pregnancy = keyboard.nextBoolean();
									if (pregnancy == true) {
										System.out.println("You cannot donate.");
									} else {
										System.out.println(
												"How many months ago did you get your last tattoo or piercing? ");
										keyboard.nextLine();
										tattoosPiercing = Integer.parseInt(keyboard.nextLine());
										if (tattoosPiercing < 6) {
											System.out.println("You cannot donate.");
										} else {
											System.out.println(
													"How many months ago did you have the last blood transfusion? ");
											transfusion = Integer.parseInt(keyboard.nextLine());
											if (transfusion < 4) {
												System.out.println("You cannot donate.");
											} else {
												System.out.println(
														"Have you taken a trip to the tropics in the last 3 month? true/false ");
												tropicsTrip = keyboard.nextBoolean();
												if (tropicsTrip == true) {
													System.out.println("You cannot donate.");
												} else {
													System.out.println(
															"Do you have a sexually transmitted disease? true/false ");
													std = keyboard.nextBoolean();
													if (std == true) {
														System.out.println("You cannot donate.");
													} else {
														System.out.println(
																"Do you use or have used light/heavy drugs? true/false ");
														drugs = keyboard.nextBoolean();
														if (drugs == true) {
															System.out.println("You cannot donate.");
														} else {
															System.out.println(
																	"Are you involved in risky sexual activities? true/false ");
															riskySexualActivity = keyboard.nextBoolean();
															keyboard.close();
															if (riskySexualActivity == true) {
																System.out.println("You cannot donate.");
															} else {
																System.out.println("You can donate.");
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}