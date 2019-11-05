package operators_and_flows;

public class flows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int anum = (int) (Math.random() * (10 - 60) + 1);

		if (anum < 18) {
			System.out.println("Sorry! you can't drive");
		}

		else if (anum > 18 && anum < 21) {
			System.out.println("You can drive at the army");
		} else if (anum > 21 && anum < 24) {
			System.out.println("You can drive at the india");
		}

		else {
			System.out.println("you are too old ");
		}
	}

}
