package com.project.square;

public class SquareImpl implements Square {

	@Override
	public int getSquare(int num) {
		int square = num * num;
		return square;
	}

}
