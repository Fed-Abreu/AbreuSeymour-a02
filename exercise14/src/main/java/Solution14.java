import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Federico Abreu Seymour
 */
public class Solution14 {
    private void calculateStateTax(String state, double orderAmount){
        //Calculate Tax based on IF thats the state or If not state
        if(state.equals("WI")){
            //Display Subtotal
            System.out.print("The subtotal is " + orderAmount + ".\n");

            double tax = 0.55;
            //Display Tax
            System.out.printf("The tax is $%.2f.%n", tax);

            // Calculate Total
            double total = orderAmount + tax;

            //Display Total
            System.out.printf("The total is $%.2f.", total);
        }
        if(!state.equals("WI")){
            //Display Total
            System.out.printf("The total is $%.2f.", orderAmount);
        }
    }
    public static void main(String[] args) {
        Solution14 sol = new Solution14();
        Scanner input = new Scanner(System.in);
        //Display What order is the amount? Scan double
        System.out.print("What is the order amount? ");
        double orderAmount = input.nextDouble();

        //Display What is the state Scan string
        System.out.print("What is the state? ");
        String state = input.next();



        sol.calculateStateTax(state, orderAmount);


    }
}
