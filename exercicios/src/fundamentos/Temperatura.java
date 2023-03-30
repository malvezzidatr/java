package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		// (f - 32) * 5/9 = C
		final int count = 32;
		double fareheith = 0;
		final double divide = 5 / 9.0;
		double celsius = (fareheith - count) * divide;
		System.out.println(celsius);
	}
}
