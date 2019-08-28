package a1;

import java.util.Scanner;

public class A1Jedi {

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
		
		int[] amountCust = new int[count];
		for(int k = 0; k < amountCust.length; k++) {
			amountCust[k] = 0;
		}
		int[] amountBought = new int[count];
		for(int k = 0; k < amountBought.length; k++) {
			amountBought[k] = 0;
		}
		
		for(int i = 0; i < countP; i++) {
			names[i][0] = scan.next();
			names[i][1] = scan.next();
			int countI = scan.nextInt();
			
			for(int j = 0; j < countI; j++) {
				 int factor = scan.nextInt();
				 String item = scan.next();
				 amountBought[findPrice(items, item)] +=  factor;
				 amountCust[findPrice(items, item)] += 1;
			}
		}
		
		for(int i = 0; i < items.length; i++) {
			if(amountCust[i] == 0) {
				System.out.println("No customers bought " + items[i]);
			} else {
				System.out.println(amountCust[i] + " customers bought " + amountBought[i] + " " + items[i]);
			}
		}
		
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
	
}
