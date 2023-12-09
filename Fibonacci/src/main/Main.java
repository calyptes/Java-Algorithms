package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int limit;
		int x;
		int y;
		int z;
		Scanner keyboard;

		keyboard = new Scanner(System.in);
		x = 0;
		y = 0;
		z = 0;

		System.out.println("Insert limit: ");
		limit = Integer.parseInt(keyboard.nextLine());

		while (limit > 0) {

			if (x == 0) {
				y = 1;
				z = x + y;
				x = y;
			} else {
				x = y;
				y = z;
				z = x + y;
			}

			System.out.println(z);

			limit--;
		}
		keyboard.close();
	}
}