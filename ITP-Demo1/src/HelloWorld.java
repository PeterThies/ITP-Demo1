public class HelloWorld {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			System.out.println("This is my message: " + helper());
		}
	}

	protected static String helper() {
		return "Hello everybody!";
	}

}
