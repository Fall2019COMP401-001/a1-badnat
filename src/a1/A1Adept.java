package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int count = scan.nextInt();
		
		String[] items = new String[count];
		double[] prices = new double[count];
		
		for(int i = 0; i < count; i++) {
			items[i] = scan.next();
			prices[i] = scan.nextDouble();
		}
		
		int countP = scan.nextInt();
		
		String[][] names = new String[countP][2];
		double[] totals = new double[countP];
		
		for(int i = 0; i < countP; i++) {
			names[i][0] = scan.next();
			names[i][1] = scan.next();
			int countI = scan.nextInt();
			
			for(int j = 0; j < countI; j++) {
				 int factor = scan.nextInt();
				 totals[i] +=  factor * prices[findPrice(items, scan.next())];
			}
		}
		
		int big = findBiggest(totals);
		int low = findLowest(totals);
		
		System.out.println("Biggest: " + names[big][0] + " " + names[big][1] + " (" + String.format("%.2f", totals[big]) + ")");
		System.out.println("Smallest: " + names[low][0] + " " + names[low][1] + " (" + String.format("%.2f", totals[low]) + ")");
		System.out.println("Average: " + String.format("%.2f", average(totals)));
	}
	
	static int findPrice(String[] items, String item) {
		
		for(int i = 0; i < items.length; i++) {
			if (items[i].equals(item)) {
				return i;
			}	
		}
		System.out.println("item not found");
		return -1;
	}
	
	static int findBiggest(double[] totals) {
		int temp = 0;
		for(int i = 0; i < totals.length; i++) {
			if (totals[i] > totals[temp]) {
				temp = i;
			}
		}
		return temp;
	}
	
	static int findLowest(double[] totals) {
		int temp = 0;
		for(int i = 0; i < totals.length; i++) {
			if (totals[i] < totals[temp]) {
				temp = i;
			}
		}
		return temp;
	}
	
	static double average(double[] totals) {
		double temp = 0;
		for(int i = 0; i < totals.length; i++) {
			temp += totals[i];
		}
		return temp / totals.length;
	}
	
}
