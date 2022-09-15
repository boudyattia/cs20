package SkillBuilding;

import java.text.DecimalFormat;

public class DistanceP1 {

	public static void main(String[] args) {
		
		DecimalFormat dc = new DecimalFormat("0.0");
		
		double D1 = 12.2; 
		double D2 = 10.6;   //all 3 distances 
		double D3 = 5.8;
		
		double FD = D1 + D2 + D3; //final distances 
	
		

		System.out.println("The total distance " + dc.format(FD) + ("km"));
	}

}
