package day5;

import java.util.Scanner;

public class Multiplication_Table_Generator {

	public static void main(String[] args) {

		System.out.println("Enter the number to print its multiplication table");

		Scanner Scanner = new Scanner(System.in);
		int number = Scanner.nextInt();

		for (int i = 1; i <= 10; i++)

		{
			int result = number * i;

			System.out.println(number + " x " + i + " = " + result);

		}

		Scanner.close();

	}

}
