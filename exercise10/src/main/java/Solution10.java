import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Federico Abreu Seymour
 */
public class Solution10 {
    private void calculations (double item1, int quantity1, double item2, int quantity2, double item3,int quantity3){
        //Calculate The subtotal by multiplying each item by quantity and put them together
        double subTotal = (item1 * quantity1) + (item2 * quantity2) + (item3 * quantity3);

        //Calculate the Tax
        double tax = subTotal * 0.055;

        //Calculate Total
        double total = subTotal + tax;

        //Display subtotal
        System.out.print("SubTotal: $" + subTotal + "\n");
        //Display Tax
        System.out.print("Tax: $" + tax + "\n");
        //Display Total
        System.out.print("Total: $" + total);
    }
    public static void main(String[] args) {
        Solution10 sol = new Solution10();
        Scanner input = new Scanner(System.in);
        //Display Enter price of item 1 and Scan double
        System.out.print("Enter the price of item 1: ");
        double item1 = input.nextDouble();
        //Display Enter the quantity of item 1 and Scan int
        System.out.print("Enter the quantity of item 1: ");
        int quantity1 = input.nextInt();
        //Display Enter price of item 2 and Scan double
        System.out.print("Enter the price of item 2: ");
        double item2 = input.nextDouble();
        //Display Enter the quantity of item 2 and Scan int
        System.out.print("Enter the quantity of item 2: ");
        int quantity2 = input.nextInt();
        //Display Enter price of item 3 and Scan double
        System.out.print("Enter the price of item 3: ");
        double item3 = input.nextDouble();
        //Display Enter the quantity of item 3 and Scan int\
        System.out.print("Enter the quantity of item 3: ");
        int quantity3 = input.nextInt();

        sol.calculations( item1,  quantity1,  item2,  quantity2,  item3, quantity3);




    }
}
