package javolin.training.chamber1;

import java.util.Scanner;

public class SwapUsingXOR {

	public static void swap(long a, long b) {

		a = a ^ b;
		b = a ^ b;
		a = a ^ b;

		System.out.println("After Swap: a=" + a + ":" + "\t" + "b=" + b);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Numbers to Swap");
		long a = scanner.nextLong();
		long b = scanner.nextLong();
		System.out.println("Before Swap: a=" + a + ":" + "\t" + "b=" + b);
		SwapUsingXOR.swap(a, b);
		scanner.close();

	}

}
