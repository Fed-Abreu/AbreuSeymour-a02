import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Federico Abreu Seymour
 */
public class Solution17 {
    private void calculateBAC(double r, double ounces, double weight, int hours){
        //Calculate BAC (alcohol*5.14/weight*r)-0.015 * hours since last
        double bAC = (ounces * 5.14 / weight * r) - 0.015 * hours;

        //Display BAC
        System.out.print("Your BAC is " + bAC + "\n");

        //If >= 0.08 cant drive else they can drive and Display If legal or not drive
        if(bAC >= 0.08){
            System.out.print("It is not legal for you to drive");
        }
        else{
            System.out.print("It is legal for you to drive");
        }

    }
    public static void main(String[] args) {
        double r;
        Solution17 sol = new Solution17();
        Scanner input = new Scanner(System.in);
        //Display Enter either male of female: Scan an int
        System.out.print("Enter a number 1 is you are male or a 2 if you are female: ");
        int gender = input.nextInt();

        //If male make R = 0.73 else make it 0.66
        if(gender == 1)
            r = 0.73;
        else
            r = 0.66;


        //Display How many ounces of alcohol Scan in double
        System.out.print("How many ounces of alcohol did you have? ");
        double ounces = input.nextDouble();

        // Display What is you weight Scan in double
        System.out.print("What is your weight, in pounds? ");
        double weight = input.nextDouble();

        //Diplay how many hours since last drink Scan int
        System.out.print("How many hours has it been since your last drink? ");
         int hours = input.nextInt();


        sol.calculateBAC(r, ounces, weight, hours);



    }
}
