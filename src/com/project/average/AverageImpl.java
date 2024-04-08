package com.project.average;

public class AverageImpl implements Average {

	@Override
	public int getAverage(int num1, int num2, int num3, int num4, int num5) {
		int average = num1 + num2 + num3 + num4 + num5 / 5;
		return average;
	}

	@Override
	public int getSum(int num1, int num2, int num3, int num4, int num5) {
		int sum = num1 + num2 + num3 + num4 + num5;
		return sum;
	}

}
