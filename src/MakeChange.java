
import java.util.Scanner;

public class MakeChange {
	
	

	public static void main(String[] args) {
		/*
		 * modulus is dank
		 * math.round() exist, v dank
		 * git add .
		 * git commit -m
		 * git push
		 */
		Scanner sc = new Scanner(System.in);
		double price = 0;
		double pay = 0;
		int twenties = 0;
		int tens = 0;
		int fives =0;
		int ones = 0;
		int quarters = 0;
		int dimes = 0;
		int nickles = 0;
		int pennies = 0;
		
		
		System.out.println("Please enter the price of the item");
		price = sc.nextDouble();
		
		System.out.println("Please enter how much you paid");
		pay = sc.nextDouble();
		
		if (price < pay) {
//			System.out.println("working");
			price = price * 100;
			price = (int) price;
			pay = pay * 100;
			pay =(int) pay;	
			System.out.println("Your change is ...");
		
		int diff = (int) pay - (int) price;
//		System.out.println(diff);
		
			if (diff >= 2000){
				twenties = diff / 2000;
				diff = diff - (twenties * 2000);
				System.out.println( "20 dollar bills: " + twenties);
			}
			if (diff >= 1000){
				tens = diff / 1000;
				diff = diff - (tens * 1000);
				System.out.println( "10 dollar bills: " + tens);
			}
			if (diff >= 500){
				fives = diff / 500;
				diff = diff - (fives * 500);
				System.out.println( "5 dollar bills: " + fives);
			}
			if (diff >= 100){
				ones = diff / 100;
				diff = diff - (ones * 100);
				System.out.println( "1 dollar bills: " + ones);
			}
			if (diff >= 25){
				quarters = diff / 25;
				diff = diff - (quarters * 25);
				System.out.println( "Quarters: " + quarters);
			}
			if (diff >= 10){
				dimes = diff / 10;
				diff = diff - (dimes * 10);
				System.out.println( "Dimes: " + dimes);
			}
			if (diff >= 5){
				nickles = diff / 5;
				diff = diff - (nickles * 5);
				System.out.println( "Nickles: " + nickles);
			}
			if (diff >= 1){
				pennies = diff / 1;
				diff = diff - (pennies * 1);
				System.out.println( "Pennies: " + pennies);
			}
		
				if (diff == 0) {
					System.out.println("success!");
				}
				
				else {
					System.out.println("Something broke");
				}
		
}
		else {
			System.out.println("You didn't pay enough");

		sc.close();
		
//		pay = pay / 2000;
//		int newPay = (int) pay;
		
//		System.out.println(newPay + " " + price);
	}

}
}
















