package com.openclassrooms.ideinstall;

public class BasicExample {

	public static void main(String[] args) {
		int i;
		for(i=0; i<=10; i++) {
			System.out.println("Hello bugs !");
			i++;
		}
		
		int[] tab= {101,202,303,404,505,605};
		
		for (int j = 0; j < tab.length; j++) {
			System.out.println("tab["+j+"]="+tab[j]);			
		} 
		
	}
}
