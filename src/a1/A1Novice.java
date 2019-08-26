package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		int count = scan.nextInt();              // amount of people to enter
		
		String[][] names = new String[count][2]; // set up array for names
		
		double[] totals = new double[count];     // array for totals
		
		// loop through number of people
		for(int i = 0; i < totals.length; i++) {
			names[i][0] = scan.next();          // assign name to name array
			names[i][1] = scan.next();
			int itemAmount = scan.nextInt();    // get amount of items purchased 
			double sum = 0;                     // set up sum for total
			// loop through amount of items purchased
			for(int j = 0; j < itemAmount; j++) {
				double factor = scan.nextDouble(); // record how many
				String item = scan.next();         // what its called, not really used
				double price = scan.nextDouble();  // price of the item
				sum += factor * price;             // price for the amount of that item added to sum
			}
			totals[i] = sum;                 // assign price of all items to totals                       
		}
		
		for(int i = 0; i < totals.length; i++) { 
			
			System.out.println(names[i][0].charAt(0) + ". " + names[i][1] + ": " + String.format("%.2f", totals[i]));
		}
		
	}
}
