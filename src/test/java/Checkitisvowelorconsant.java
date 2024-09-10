import java.util.Scanner;

public class Checkitisvowelorconsant {

	
		
		  public static boolean check(char ch) {
		        
		        return false;
		    }
		    
		    public static void main(String[] args) {
		        //Scanner class for taking user input
		        Scanner sc =new Scanner(System.in);
		        
		        System.out.println("Enter a character");
		        
		        // Taking character input
		        char ch=sc.next().charAt(0);
		        if(check(ch)) {
		            
		            System.out.println(ch +" is a vowel");
		            
		        }else {
		            
		            System.out.println(ch+" is a constant");
		        }        
		    }
		

	}


