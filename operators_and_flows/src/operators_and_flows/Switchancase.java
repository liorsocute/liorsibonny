package operators_and_flows;

public class Switchancase {
	public static void main(String[] args) {

		int age = (int) (Math.random() * (15 - 10) + 1);
		switch (age) {

		case 3:
			System.out.println("you are too young");
			break;

		case 12:
			System.out.println("try to be unique");
			break;
		case 19:
			System.out.println("you are no unique");
			break;
		default:
			System.out.println("meowwww");

		}

	}

}
