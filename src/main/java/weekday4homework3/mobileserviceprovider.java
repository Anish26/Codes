package weekday4homework3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class mobileserviceprovider {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int phone = sc.nextInt();
		serviceProvider(phone);
		//System.out.println(serviceProvider(900));
		
	}
	



	//to print the mobile service provider
	public static int serviceProvider(int number) {
		System.out.println("Enter the serviceProvider");
		if(number == 944) {
			System.out.println("Bsnl");
		}else if (number == 900){
			System.out.println("Airtel");
		}else if (number == 897) {
			System.out.println("Idea");
		}else if (number== 630) {
			System.out.println("Jio");
		}
		return number;
		}
			
			
		}
		
	