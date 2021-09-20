import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Federico Abreu Seymour
 */
public class Solution18 {
    private void converter(String choice,double temp){
        //Calculate Conversion
        //Display temperature of C is (double)

        double tempConverted;
        if(choice.equals("C") || choice.equals("c")){
            tempConverted = (temp - 32) * 5 / 9;

        }
        else{
            tempConverted = (temp * 9 / 5) + 32;
        }
        System.out.print("The temperature in Celsius is " + tempConverted + ".");


    }
    public static void main(String[] args) {
        Solution18 sol = new Solution18();
        Scanner input = new Scanner(System.in);
        //Display Press C to convert Fahrenheit to Celsius (/n)<-Display Press F to convert Celsius to Fahrenheit
        System.out.print("Press C to convert from Fahrenheit to Celsius.\nPress F to convert from Celsius to Fahrenheit.\n");

        //Display Your choice: Scan string
        System.out.print("Your choice : ");
        String choice = input.next();

        //Display Please enter the temperature in F or C: Scan double
        String tempType = (choice.equals("C"))||(choice.equals("c"))? "Please enter the temperature in Fahrenheit: " : "Please enter the temperature in Celsus: ";
        System.out.print(tempType);
        double temp = input.nextDouble();

        sol.converter(choice, temp);


    }
}
