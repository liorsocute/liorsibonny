package operators_and_flows;

public class Flowssec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age = (int) (Math.random() * (60 - 10) + 1);
		String messege = " ";

		messege = (age < 18) ? "sorry! can't drive"
				: (age > 18 && age < 21) ? "you can drive atr the army"
						: (age > 21 && age < 24) ? "you can drive in india" : "you are too old";
		System.out.println(messege);
		System.out.println(age);

	}

}
