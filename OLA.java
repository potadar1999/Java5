package com.car;

import java.util.Scanner;

public class OLA {
	
	public Car bookCar(int numberOfPassenger, int numberOfKMs) {
	if(numberOfPassenger<=3) {
		
		return new HatchBack();
	
	}
	else {
		return new Sedan();
	}
	
		
	}	
 
	
   
	public int calculateBill(Car car) {
		   int fare=0;
		if(car instanceof Sedan) {
			Car j1=new Car();
			Sedan e1=new Sedan();
			fare=fare+(j1.getNumberofKms()*e1.farePerKm);
		}
		else {
			HatchBack h1=new HatchBack();
			Car j1=new Car();
			fare=fare+(j1.getNumberofKms()*h1.farePerKm);
		}
		return fare;
	}
	
	
}

