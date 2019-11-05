
import java.util.Scanner;

public class Whileloop {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("please enter your name: ");
		String name = input.nextLine();
		char fl = name.charAt(0);
		char ll = name.charAt(name.length() - 1);

		while (!(fl == 'a') && !(ll == ('b'))) {
			System.out.println("bad");
			name = input.nextLine();

		}
		System.out.println("good");
	}

}
