package com.project.switchcode;

import java.util.Scanner;

import com.project.addtion.Addition;
import com.project.addtion.AdditionImpl;
import com.project.average.Average;
import com.project.average.AverageImpl;
import com.project.commoncode.Common;
import com.project.cube.Cube;
import com.project.cube.CubeImpl;
import com.project.division.Division;
import com.project.division.DivisionImpl;
import com.project.evenodd.EvenOdd;
import com.project.evenodd.EvenOddImpl;
import com.project.factors.FactorsImpl;
import com.project.factors.Factors;
import com.project.modulus.Modulus;
import com.project.modulus.ModulusImpl;
import com.project.multiplication.Multiplication;
import com.project.multiplication.MultiplicationImpl;
import com.project.square.Square;
import com.project.square.SquareImpl;
import com.project.substraction.Substraction;
import com.project.substraction.SubtractionImpl;

public class IteratorSwitchCase {

	public void data() {
		// Common cm = new Common();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your choise:");

		System.out.println("1.Addition of two numbers" + '\n' + "2.Substraction of two numbers" + '\n'
				+ "3.Multiplication of two numbers" + '\n' + "4.Division of two numbers" + '\n'
				+ "5.Modulus of two numbers" + '\n' + "6.Square of number" + '\n' + "7.Cube of number" + '\n'
				+ "8.Average of number" + '\n' + "9.Factors of numbers" + '\n' + "10.find out even or odd number");

		switch (sc.nextInt()) {

		case 1: {
			System.out.println("Enter the first number>>");
			int num1 = sc.nextInt();
			System.out.println("Enter the second number>>");
			int num2 = sc.nextInt();
			Addition adition = new AdditionImpl();
			System.out.println("Addtion is >> " + adition.getAddtion(num1, num2));
			break;

		}
		case 2: {
			System.out.println("Enter the first number>>");
			int num1 = sc.nextInt();
			System.out.println("Enter the second number>>");
			int num2 = sc.nextInt();
			Substraction substraction = new SubtractionImpl();
			System.out.println("Substraction is >> " + substraction.getSubstraction(num1, num2));
			break;
		}
		case 3: {
			System.out.println("Enter the first number>>");
			int num1 = sc.nextInt();
			System.out.println("Enter the second number>>");
			int num2 = sc.nextInt();
			Multiplication multiplication = new MultiplicationImpl();
			System.out.println("Multiplication is >> " + multiplication.getMultiplication(num1, num2));
			break;

		}
		case 4: {
			System.out.println("Enter the first number>>");
			int num1 = sc.nextInt();
			System.out.println("Enter the second number>>");
			int num2 = sc.nextInt();
			Division division = new DivisionImpl();
			System.out.println("Divition is >> " + division.getDivision(num1, num2));
			break;
		}
		case 5: {
			System.out.println("Enter the first number>>");
			int num1 = sc.nextInt();
			System.out.println("Enter the second number>>");
			int num2 = sc.nextInt();
			Modulus modulus = new ModulusImpl();
			System.out.println("Modulus is >> " + modulus.getModulus(num1, num2));
			break;
		}
		case 6: {
			System.out.println("enter any number");
			int num = sc.nextInt();
			Square square = new SquareImpl();
			System.out.println("Square is >>" + square.getSquare(num));
			break;
		}
		case 7: {
			System.out.println("Enter any number");
			int num = sc.nextInt();
			Cube cube = new CubeImpl();
			System.out.println("Cube is >> " + cube.getCube(num));
			break;
		}
		case 8: {
			System.out.println("Enter the first number>>");
			int num1 = sc.nextInt();
			System.out.println("Enter the second number>>");
			int num2 = sc.nextInt();
			System.out.println("Enter the third number>>");
			int num3 = sc.nextInt();
			System.out.println("Enter the fourth number>>");
			int num4 = sc.nextInt();
			System.out.println("Enter the fifth number>>");
			int num5 = sc.nextInt();

			Average average = new AverageImpl();
			System.out.println("Average is >> " + average.getAverage(num1, num2, num3, num4, num5));
			System.out.println("Total sum is >> " + average.getSum(num1, num2, num3, num4, num5));
			break;
		}
		case 9: {
			System.out.println("Enter any number");
			int num = sc.nextInt();
			Factors factors = new FactorsImpl();
			//factors.getFactors(num);
			System.out.println("factors are >>"+ factors.getFactorsList(num));
			break;
		}
		case 10: {
			System.out.println("Enter any number");
			int num = sc.nextInt();
			EvenOdd evenOdd = new EvenOddImpl();
			evenOdd.getEvenOdd(num);
			break;
		}

		}

		sc.close();

	}
}
