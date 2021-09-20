import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Federico Abreu Seymour
 */
public class Solution13 {
    private void investment(int principal, double percentRate, int years, double rate, int compound){
        //Calculate  how much the investment is worth investments princ* mathpow(1+rate/comp),(comp*year)
        double investment = principal * Math.pow((1 + percentRate/compound),(compound * years));

        //Display the years at the rate in percent and how much the investment is
        System.out.printf("$%d invested at %.1f%% for %d years compounded %d times per year is $%.2f.", principal, rate, years, compound, investment);
    }
    public static void main(String[] args) {
        Solution13 sol = new Solution13();
        Scanner input = new Scanner(System.in);
        //Display Enter the principal: and Scan input as double
        System.out.print("What is the principal amount? ");
        int principal = input.nextInt();

        //Display Enter rate of interest Scan double
        System.out.print("What is the rate? ");
        double rate = input.nextDouble();

        //PercentRate = rate/100
        double percentRate = rate/100;

        //Display Enter number of years: Scan double
        System.out.print("What is the number years? ");
        int years = input.nextInt();

        //Display what the compounded per year is wanted scan int
        System.out.print("What is the number of times the interest is compounded per year? ");
        int compound = input.nextInt();

        sol.investment(principal, percentRate, years, rate,compound);



    }
    }

