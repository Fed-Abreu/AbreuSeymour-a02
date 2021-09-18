import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Federico Abreu Seymour
 */
public class Solution09 {
    private void calculationsPerGallon(double length, double width){
        double sqPerGallon = 350;
        //Calculate totalsq Length * Width
        double totalSq = length * width;

        //Calculate how many gallons is needed totalsq/350 math.ciel to round
        final int gallons = (int)Math.ceil(totalSq/sqPerGallon);

        System.out.print("You will need to purchase " + gallons + " gallons of paint to cover " + totalSq + " square feet.");

    }
    public static void main(String[] args) {
        Solution09 sol = new Solution09();

        Scanner input =  new Scanner(System.in);
        //Display Length and scan double
        System.out.print("What is the length? ");
        double length = input.nextDouble();
        //Display Width and scan double
        System.out.print("What is the Width? ");
        double  width = input.nextDouble();

        // Display Gallons needed
        sol.calculationsPerGallon(length, width);


    }
}
