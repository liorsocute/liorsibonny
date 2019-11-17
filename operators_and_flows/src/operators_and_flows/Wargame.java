package operators_and_flows;

import java.util.Arrays;
import java.util.Scanner;

public class Wargame {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String player1n = input.next();
		String player2n = input.next();
		input.close();
		int counter1 = 0;
		int counter2 = 0;

		int[] player1 = new int[25];
		int[] player2 = new int[25];

		for (int i = 0; i < player1.length; i++) {
			player1[i] = (int) (Math.random() * 15 - 0);
			player2[i] = (int) (Math.random() * 15 - 0);
		}

		for (int j = 0; j < player2.length; j++) {
			int cont2 = player2[j];
			int cont1 = player1[j];
			if (cont1 > cont2) {
				counter1++;
			} else if (cont2 > cont1) {
				counter2++;
			} else {
				j++;
				int cont3 = player1[j];
				int cont4 = player2[j];
				if (cont3 > cont4) {
					counter1 += 2;
				} else {
					counter2 += 2;
				}

			}
		}

		System.out.println(Arrays.toString(player1));
		System.out.println(Arrays.toString(player2));
		if (counter1 > counter2) {
			System.out.printf("the winner is %s with %d points", player1n, counter1);
		}

		else if (counter1 == counter2) {
			System.out.println("its a tie");
		} else {
			System.out.printf("the winner is %s with %d points", player2n, counter2);
		}
	}

}
