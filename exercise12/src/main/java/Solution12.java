import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Federico Abreu Seymour
 */
public class Solution12 {
    private void investment(double principal, double percentRate, int years, double rate){
        //Calculate  how much the investment is worth invest = Princ * (1 + rate * years)
        double investment = principal * (1 + percentRate * years);

        //Display the years at the rate in percent and how much the investment is
        System.out.printf("After %d years at %.1f%%, the investment will worth $%.2f", years, rate, investment);
    }
    public static void main(String[] args) {
        Solution12 sol = new Solution12();
        Scanner input = new Scanner(System.in);
        //Display Enter the principal: and Scan input as double
        System.out.print("Enter the principal: ");
        double principal = input.nextDouble();

        //Display Enter rate of interest Scan double
        System.out.print("Enter the rate of interest: ");
        double rate = input.nextDouble();

        //PercentRate = rate/100
        double percentRate = rate/100;

        //Display Enter number of years: Scan double
        System.out.print("Enter the number of years: ");
        int years = input.nextInt();

        sol.investment(principal, percentRate, years, rate);



    }

}
