import java.util.Objects;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Federico Abreu Seymour
 */
public class Solution20 {
    private void tax(String state , double orderAmount) {
        Scanner input = new Scanner(System.in);
        double tax = 0;
        double total= 0;
        //If Wisconsin Display what county and Scan String
        if (Objects.equals(state, "Wisconsin")) {
            System.out.print("What county do you live in? ");
            String county = input.nextLine();
            //Calculate Wisconsin tax and total
            tax = orderAmount * 0.05;
            total = orderAmount + tax;
            //If county is Dunn calculate tax and total
            if (county.equals("Dunn")) {
                tax = orderAmount * 0.054;
                total = orderAmount + tax;

                //If Eau Claire is county calculate tax and total
            } else if (county.equals("Eau Claire")) {
                tax = orderAmount * 0.055;
                total = orderAmount + tax;

            }
        }
            //If Illinois Calculate tax and total
            else if (Objects.equals(state, "Illinois")){
                tax = orderAmount * 0.08;
                total = orderAmount + tax;

            }
            //else no tax state then none have tax = 0
            else{
                tax = 0;
                total = orderAmount;
            }//If its wisconsin or illinois diplay both tax and total
            if(Objects.equals(state, "Wisconsin") || Objects.equals(state, "Illinois")) {
                System.out.print("The tax is $" + String.format("%.2f",tax) + "\nThe total is $"+String.format("%.2f",total));
            }
            //else Display just total
            else{System.out.print("The total is $"+String.format("%.2f",total));

            }
        }

    public static void main(String[] args) {
        Solution20 sol = new Solution20();
        Scanner input = new Scanner(System.in);
        //Display What is the order amount Scan double
        System.out.print("What is the order amount? ");
        double orderAmount = input.nextDouble();

        //Display What state do you live in Scan String
        System.out.print("What state do you live in? ");
        String state = input.next();


        sol.tax(state, orderAmount);

    }
}





