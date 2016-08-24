package javolin.training.chamber1;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class SumOfNumbers {

	public static void sum(BigInteger number) {

		BigInteger result = BigInteger.ZERO, i = BigInteger.ONE;
		while (i.compareTo(number) != 1) {
			result = result.add(i);
			i = i.add(BigInteger.ONE);
		}
		

		System.out.println("Sum of N Numbers:" + result);
	}

	public static void  squareSum(BigInteger number) {

		BigInteger SquareSumresult = BigInteger.ZERO, i = BigInteger.ONE;
		while (i.compareTo(number) != 1) {
			SquareSumresult = SquareSumresult.add(i.multiply(i));
			i = i.add(BigInteger.ONE);
		}
		System.out.println("Sum of squares:" + SquareSumresult);
	}
	
	public static void  cubesSum(BigInteger number) {

		BigInteger cubesSumResult = BigInteger.ZERO, i = BigInteger.ONE;
		while (i.compareTo(number) != 1) {
			cubesSumResult = cubesSumResult.add(i.multiply(i).multiply(i));
			i = i.add(BigInteger.ONE);
		}
		System.out.println("Sum of cubes:" + cubesSumResult);
	}

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The number");
		BigInteger number = scanner.nextBigInteger();
		SumOfNumbers.sum(number);
		SumOfNumbers.squareSum(number);
		SumOfNumbers.cubesSum(number);
		scanner.close();

	}

}