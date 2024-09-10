package LamdaTestDemo;

import java.util.Scanner;

public class Countcharatindex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")

		String str = "javaruby";
		
		  int t=str.length(); char ch[]=str.toCharArray(); 
		  for(int i=0;i<t;i++) {
		  ch[i]=str.charAt(i);  
		  }
		  for(int i=0;i<t;i++) {
		  System.out.println("Character at index  "+ch[i]);
		  
		  
		  }
		 

		System.out.println(str.indexOf('r'));
	}

}
