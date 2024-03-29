
import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Federico Abreu Seymour
 */
public class Solution07 {
    private void calculations(double length, double width){
        double area = length * width;
        System.out.print(area + " square feet\n");

        //Convert the area into square meters and display the values
        final double Conversion = area * 0.09290304;

        System.out.printf("%.3f square meters ", Conversion);

    }
    public static void main(String[] args) {
        Solution07 sol = new Solution07();

        Scanner input = new Scanner(System.in);
        //Display What length the room is and Scan into a double
        System.out.print("What is the length of the room in feet? ");
        double length = input.nextDouble();

        //Display What width it is and scan into double
        System.out.print("What is the width of the room in feet? ");
        double width = input.nextDouble();

        //Display the dimensions they entered
        System.out.print("You entered dimensions of " + length + " feet by " + width + " feet.\n");
        //Display "The area is"
        System.out.print("The area is ");

        //Display The Calculations
        sol.calculations(length, width);




    }
}
