package com.car;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		Car c1=new Car();
		System.out.println("Enter number of Passenger");
		int numberofPassenger=sc.nextInt();
		c1.setNumberofKms(numberofPassenger);
		
		System.out.println("Enter number of Kms");
		int numberofKms=sc.nextInt();
		c1.setNumberofKms(numberofKms);
		
		
		OLA myOla =new OLA();
		Car myCar =myOla.bookCar(numberofPassenger, numberofKms);
		int res = myOla.calculateBill(myCar);
		
		System.out.println("total fare amount "+res);
		
	}

}
