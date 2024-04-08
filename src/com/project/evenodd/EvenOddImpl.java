package com.project.evenodd;

public class EvenOddImpl implements EvenOdd {

	@Override
	public void getEvenOdd(int num) {
		if (num % 2 == 0) {
			System.out.println("It's even number");
		} else {
			System.out.println("It's odd number");
		}
	}

}
