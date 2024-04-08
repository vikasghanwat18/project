package com.project.factors;

import java.util.ArrayList;
import java.util.List;

public class FactorsImpl implements Factors {

//	@Override
//	public void getFactors(int num) {
//
//		System.out.println("Factors of " + num + ": ");
//		for (int i = 1; i <= num; ++i) {
//			if (num % i == 0) {
//				System.out.println(i + " ");
//			}
//
//		}
//	}

	public List<Integer> getFactorsList(int num) {
		List<Integer> factList = new ArrayList<>();
		for (int i = 1; i <= num; ++i) {
			if (num % i == 0) {
				factList.add(i);
			}
		}
		return factList;
	}
}
