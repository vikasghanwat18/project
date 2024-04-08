package com.project.modulus;

public class ModulusImpl implements Modulus {

	@Override
	public int getModulus(int num1, int num2) {
		int modulus = num1 % num2;
		return modulus;
	}

}
