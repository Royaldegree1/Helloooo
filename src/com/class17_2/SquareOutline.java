package com.class17_2;

public class SquareOutline {

	public static void main(String[] args) {
		//		//print 
		//******    4 rows  6 columns
		//*    *
		//*    *
		//******
		
		SquareOutline assignment = new SquareOutline() ;
			
			assignment.SquareOutline();
		}
		
		
		
		void SquareOutline() {
		for(int a=1; a<=4; a++) {
			for(int b=1; b<=6; b++) {
				if(a==1 || a==4 || b==1 || b==6) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
		System.out.println();
		
		}

	}
	}

