package Methods;

public class Task4 {

	public static int add() {
		int a = 10;
		int b = 20;

		int sum = a + b;

		// System.out.println(sum);
		// System.out.println(sum % 2 == 0 ? "Even" : "Odd");
		return sum;
	}

	public static void main(String[] args) {

		int sum   =add();
		System.out.println(sum);
		System.out.println(sum % 2 == 0? "Even " : "Odd");

	}
}