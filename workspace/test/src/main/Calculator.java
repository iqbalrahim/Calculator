package main;

import calculator.Addition;
import calculator.Division;
import calculator.Subtraction;
import calculator.Multiplication;

public class Calculator {
	public static void main(String[] args) {
		Addition add = new Addition();
		int sum = add.add(2, 8);
		System.out.println(sum);
		Subtraction sub = new Subtraction();
		int minus = sub.sub(8, 12);
		System.out.println(minus);
		Multiplication mul = new Multiplication();
		int product = mul.mul(8, 12);
		System.out.println(product);
		Division div = new Division();
		float division = div.div(12, 5);
		System.out.println(division);
		System.out.println("A new change here to test guthub");

	}

}
