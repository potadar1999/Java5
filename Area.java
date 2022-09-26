package com.abstarct;

import java.awt.Rectangle;

public class Area extends Shape {
	
	@Override
	public int rectangleArea(int length, int breadth) {
		// TODO Auto-generated method stub
		int size=(length*breadth);
		return size;
	}
	
	
	@Override
	public int circleArea(int radius) {
		// TODO Auto-generated method stub
		int dai=((3*(radius*radius))/4);
		return dai;
	}
	
	@Override
	public int squareArea(int side) {
		// TODO Auto-generated method stub
		int squ=(side*4);
		return squ;
	}
}
