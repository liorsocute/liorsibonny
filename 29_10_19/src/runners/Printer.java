package runners;

public class Printer {

	public static void main(String[] args) {
		String part1 = "There wiil be ";
		int visitors = 5;
		String part2 = " people for dinner";
		System.out.println(part1 + visitors + part2);
		System.out.printf("%s %d %s",part1, visitors, part2);
	}

}
