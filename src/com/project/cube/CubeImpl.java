package com.project.cube;

public class CubeImpl implements Cube {

	@Override
	public int getCube(int num) {
		int cube = num * num * num;
		return cube;
	}

}
