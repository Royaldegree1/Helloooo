package Class14;

import java.lang.reflect.Array;

public class GroupTasks {

	public static void main(String[] args) {
		// 1. Write a program to swap 2 numbers without a temporary variable? Swap  2 strings without a temporary variable?
		// 2. Write a java program to find the second largest number in the array? Maximum and minimum number in the array?
		// 3. Find out how many alpha characters present in a string?
		// 4.How to find out the part of the string from a string? What is substring? Find number of words in string?
		// 5. Write a java program to reverse String? Reverse a string word by word?
		// 6. Write a Java Program to find whether a String is palindrome or not?
		
		
		
		int x=10;
		int y=20;
		
		System.out.println("Before swapping int x= " +x+ " int y = " +y);
		
		x= x + y;
		y= x - y;
		x= x - y;
		
		System.out.println("After swapping int y= " +y+ " int x = " +x);
	
		
		String c= "sprinters";
		String d= "tech";
		System.out.println("Before swap: "+c+ " " +d);
	     c=c+d;
         d= c.substring(0, c.length() - d.length());  
            c = c.substring(d.length());  
            System.out.println("After swap: " + c + " " + d);
        System.out.println("-----------------------------------");
            
        int[] array = { 10, 20, 30, 40, 966, 458 };
        int largest = array[0];
        int Secondlargest = array[0];
        for (int i = 0; i < array.length; i++) {
        	if (array[i] > largest) {
        Secondlargest = largest; 
        largest = array[i];
        } else if (array[i] > Secondlargest) {
        	Secondlargest = array[i];
        }        
        	}        
	System.out.print("Second largest " + Secondlargest +" and ");
	
	int[] arr = { 10, 20, 30, 40, 966, 458 };
	int minimum = arr[0];
	for(int j=6; j<=arr.length; j++) {
		System.out.println(" minimum  " +minimum);
	
        
	}
        
        
        System.out.println("-----------------------------------");
        String str="#$%#$%123";
        	String replaced=str.replaceAll("[A-z0-9]", "");
        	System.out.println(replaced.length());
        	System.out.println(replaced);
            
	
        	System.out.println("--------------------------------");
        	
        	
        	String original="String";
    		String reverse1="";
    		
    		char[] ar=original.toCharArray();
    		
    		for(int i=ar.length-1; i>=0; i--) {
    			reverse1=reverse1+ar[i];//""+"s"
    		}
    		System.out.println("Reversed String is: "+reverse1);
    		
    		String orig="Hello everyone, we have Java to do";
    		String reverse2="";
    		
    		char[] a=orig.toCharArray();
    		
    		for(int b=a.length-1; b>=0; b--) {
    			reverse2=reverse2+a[b];
    		}
    		System.out.println("Reversed String by string is: "+reverse2);
    		
    		System.out.println("--------------------------------");
        	
    		
    		
    		String dad, reversed3="";
    	
    		
    		
    			if(dad.equals(reversed3))
    				System.out.println("Entered String is a palindrome");
    			else
    				System.out.println("Entered String is not a palindrome");
    		}
		
       }
	
		
		
            
	
	
	
