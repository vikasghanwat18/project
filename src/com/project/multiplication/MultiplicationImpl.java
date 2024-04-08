package com.project.multiplication;

public class MultiplicationImpl implements Multiplication {

	@Override
	public int getMultiplication(int num1, int num2) {
		int multiplication = num1 * num2;
		return multiplication;
	}

}
