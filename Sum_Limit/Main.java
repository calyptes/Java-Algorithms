import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Esercizio 2

		int x;
		int sum;
		int counter;
		String answer;
		Scanner keyboard;

		keyboard = new Scanner(System.in);
		x = 0;
		sum = 0;
		counter = 0;
		answer = "";

		while (sum < 27) {
			System.out.println("Enter numbers till their sum = 27: ");
			x = Integer.parseInt(keyboard.nextLine());
			if (sum + x == 27) {
				answer += x;
			} else {
				answer += x + " + ";
			}
			sum += x;
			if (x > 10) {
				counter++;
			}

		}

		System.out.println("27: sum of " + answer + " , numbers greater than 10: " + counter);
	}

}
