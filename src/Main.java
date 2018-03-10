/*
 * Written by Adam Nagao
 * 3/7/2018
 * Basic sales tax is applicable at a rate of 10% on all goods, except books, food, and medical products that are exempt. Import duty is
 * an additional sales tax applicable on all imported goods at a rate of 5%, with no exemptions.
 * When I purchase items, I receive a receipt which lists the name of all the items and their price (including tax), finishing with the total
 * cost of the items, and the total amounts of sales taxes paid. The rounding rules for sales tax are that for a tax rate of n%, a shelf price
 * of p contains (np/100 rounded up to the nearest 0.05) amount of sales tax.
 * 
 * This class servers as a driver for the supporting classes
 */
public class Main {

	public static void main(String[] args) {
		
		Receipt r1 = new Receipt("test1.txt");	
		
		r1.calculateTotals();
		
		System.out.println("Output 1");
		r1.printReceipt();
		System.out.println();

		Receipt r2 = new Receipt("test2.txt");

		r2.calculateTotals();
		
		System.out.println("Output 2");
		r2.printReceipt();
		System.out.println();
		
		Receipt r3 = new Receipt("test3.txt");
		
		r3.calculateTotals();
		
		System.out.println("Output 3");
		r3.printReceipt();
		
	}

}
