package runners;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("enter your movie length in minutes:  ");

		int movienum = input.nextInt();
		int calchoure = movienum / 60;
		int calcminu = movienum % 60;

		System.out.printf("your movie lenght is : %d houres and %d minutes", calchoure, calcminu);

		input.close();
	}

}
