package MainPackage;

import java.util.Scanner;

public class tuitionRate {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter the tuition amount: ");
		double initTuition = input.nextDouble();

		System.out
				.print("Please enter the rate your tution will increase as a whole number: ");
		double percentageInc = input.nextDouble();
		double tuitRate = percentageInc / 100;
		double tuitionSum = 0;
		double tuitionCounter = initTuition;

		for (int j = 0; j < 3; j++) {
			tuitionCounter = tuitionCounter + (tuitionCounter * tuitRate);
			tuitionSum = tuitionSum + tuitionCounter;

			

		}
		double tuitTotal = tuitionSum + initTuition;
		System.out.printf("After four years, your  total tuition costs comes to: $%.2f%n ", tuitTotal);

	}
}
