import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Federico Abreu Seymour
 */
public class Solution19 {
    private void bmiCalculator(double weight, double height){
        //Calculate BMI = (weight / (height * height)) * 703
        double bmi = (weight / (height * height)) * 703;
        //Display Your BMI is
        System.out.printf("Your BMI is %.2f \n", bmi);

        //If BMI >= 18.5 %% BMI <= 25 Display normal weight message
        if(bmi >= 18.5 && bmi <= 25){
            System.out.print("You are within the ideal weight range. ");
        }
        //If their BMI < 18.5 Display Underweight message
        if(bmi < 18.5){
            System.out.print("You are underweight. You should see your doctor. ");
        }
        //If their BMI is > 25 Display Overweight message
        if(bmi > 25){
            System.out.print("You are overweight. You should see your doctor. ");
        }
    }
    public static void main(String[] args) {
        Solution19 sol = new Solution19();
        Scanner input = new Scanner(System.in);
        //Display What is your weight Scan double
        System.out.print("What is your weight in pounds? ");
        double weight = input.nextDouble();

        //Display What is your height Scan double
        System.out.print("What is your height in inches? ");
        double height = input.nextDouble();
        sol.bmiCalculator(weight, height);
    }
}
