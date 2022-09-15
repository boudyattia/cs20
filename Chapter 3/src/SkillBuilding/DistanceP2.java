package SkillBuilding;

import java.util.Scanner;
import java.text.DecimalFormat;

public class DistanceP2 
{
	public static void main(String[] args) 
	{
		DecimalFormat dc = new DecimalFormat("0.0");
		Scanner input = new Scanner(System.in);
	
		System.out.println("Please enter only numbers");
		double D1; 
		double D2;   //all 3 distances 
		double D3; 
		System.out.println("What is the first distance");
		D1 = input.nextDouble();
		
		System.out.println("what is the second distance");		//input
		D2 = input.nextDouble();
		
		System.out.println("what is the third distance");
		D3 = input.nextDouble();
		
		double FD = D1 + D2 + D3 ;
		
		System.out.println("The total distance is "  + dc.format(FD) + ("km"));
		
		

	}

}
