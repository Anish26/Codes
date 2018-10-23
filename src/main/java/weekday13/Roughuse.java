package weekday13;

import java.util.Date;
import java.util.Scanner;


public class Roughuse {

	//public static void main(String[] args) {
		//factorial();
		//palindrome();
		//fibonanciseries();
		
	//}

	//Factorial concept
	public static void factorial() {
		//Factorial 4!=24
		System.out.println("Enter the number for Factor:");
		Scanner scan=new Scanner(System.in);
		int numb=scan.nextInt();
		int i,fact=1;
		for(i=2;i<=numb;i++){    
			fact=fact*i;    
		}    
		System.out.println("Factorial of "+numb+" is: "+fact);   
		scan.close();
	}
	
	//palindrome
	public static void palindrome() {
		//Palindrome Number
		System.out.println("Enter the number for Palindrome:");
		Scanner scan=new Scanner(System.in);
		int numb=scan.nextInt();
		int rem,sum=0,origNumb;
		origNumb=numb;    
		while(numb>0){    
			rem=numb%10; 
			sum=(sum*10)+rem;    
			numb=numb/10;    
		}    
		if(origNumb==sum)    
			System.out.println(origNumb +" is a Palindrome Number.");    
		else    
			System.out.println(origNumb +" is a Not Palindrome.");  
		scan.close();
	}

		
	public static void fibonanciseries() {
    int n = 10, t1 = 0, t2 = 1;
    System.out.print("First " + n + " terms: ");

    for (int i = 1; i <= n; ++i)
    {
        System.out.print(t1 + " + ");

        int sum = t1 + t2;
        t1 = t2;
        t2 = sum;
    }
	}
	
	public static void main(String args[]) {
		  // Instantiate a Date object by invoking its constructor
		  Date objDate = new Date();
		  // Display the Date & Time using toString()
		  System.out.println(objDate.toString());
		 }
		}

