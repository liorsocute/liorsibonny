package homework;

import java.util.Scanner;

public class First_time {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("insert 3 nums");
		int numa = input.nextInt();
		int numb = input.nextInt();
		int numc = input.nextInt();

		if (numa != numb && numa != numc) {
			if (numa < numb) {
				if (numc < numb) {
					System.out.printf("num b is the biggest %d", numb);
				} else {
					System.out.printf("num c is the biggest %d", numc);
				}

			} else {
				if (numa > numc) {
					System.out.printf("num a is the biggest %d", numa);
				} else {
					System.out.printf("num c is the biggest %d", numc);
				}
			}
		} else {
			System.out.println("same value");
		}

	}
}