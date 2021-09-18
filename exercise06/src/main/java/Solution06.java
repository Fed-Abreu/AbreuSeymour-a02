import java.util.Calendar;
import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Federico Abreu Seymour
 */

public class Solution06 {
    private void retirementCalculator(int currentAge, int retirementAge){
        //Get system time and add that time to years left
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        //calculate retirement age - current to get how many years they have left
        int yearsLeft = retirementAge - currentAge;
        int retirementYear =  currentYear + yearsLeft;

        //Display the years left until retirement
        System.out.print("You have " + yearsLeft + " years left until you can retire.\n");

        // Display current year and display what year they will retire
        System.out.print("It's " + currentYear + ", so you can retire in " + retirementYear + ".");


    }
    public static void main(String[] args) {
        Solution06 sol = new Solution06();
        Scanner input = new Scanner(System.in);
        //Ask user for current Age
        System.out.print("What is your current age? ");

        //Save Current age input from user
        String currentAge = input.nextLine();

        //Ask user what age they would like to retire then scan it
        System.out.print("At what age would you like to retire? ");
        String retirementAge = input.nextLine();

        //Change data type
        int newCurrentAge = Integer.parseInt(currentAge);
        int newRetirementAge = Integer.parseInt(retirementAge);

        sol.retirementCalculator(newCurrentAge, newRetirementAge);

    }

}
