package employee;

import java.util.Scanner;

public class Employee {
	
	void calculateAverage(int[] age) {
		
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter total no. of employee");
//		int[][] num= new int[1][3] ;
		int num1=sc.nextInt();
		if(num1<=1) {
			System.out.println("Please enter a valid employee count");
		}
		else {
			System.out.println("Enter Age of employee");
//			int age1=sc.nextInt();
			 int[][] age= new int[4][4];
		        age[0][0]=sc.nextInt();
		       age[0][1]=sc.nextInt();
		       age[0][2]=sc.nextInt();

			int avr=(age[0][0]+age[0][1]+age[0][2]);
			int tot=avr/num1;
			
			System.out.println(tot);
		}
			
		
		
		
		
		
	}
	
}


