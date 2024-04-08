package com.project.division;

public class DivisionImpl implements Division {

	@Override
	public int getDivision(int num1, int num2) {
		int division = num1 / num2;
		return division;
	}

}
