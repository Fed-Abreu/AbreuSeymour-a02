
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Federico Abreu Seymour
 */
public class Solution11 {
    private void statement(double euros, double exchangeRate){
        System.out.println(euros + " eruos at at exchange rate of " + exchangeRate + " is ");
    }
    private  void calculations (double euros, double exchangeRate){
        //Calculate the amount to US dollars and round
        double usDollars = euros * exchangeRate;
        double roundedUS = Math.ceil(usDollars * 100)/100.0;
        //Display US dollars
        System.out.print(roundedUS +" U.S. dollars.");
    }
    public static void main(String[] args) {
        Solution11 sol = new Solution11();
        Scanner input = new Scanner(System.in);
        //Display How many euros the user is exchanging and Scan double
        System.out.print("How many euros are you exchanging? ");
        double euros = input.nextDouble();
        //Display What the exchange rate is and Scan Double
        System.out.print("What is the exchange rate? ");
        double exchangeRate = input.nextDouble();
        //Display the amount euros and the exchange rate
        sol.statement(euros, exchangeRate);

        sol.calculations(euros, exchangeRate);

    }
}
