
import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Federico Abreu Seymour
 */
public class Solution08 {
    private void calculatePieces(int totalSlices, int people){
        //Calculate how many pieces each person gets
        int pieces = totalSlices / people;
        System.out.print("Each person gets " + pieces + " pieces of pizza.\n");
    }
    //Display leftovers and Calculate the leftovers
    private void calculateLeftover (int people, int totalSlices){
        int leftover = totalSlices % people;
        System.out.print("There are " + leftover + " leftover pieces.");
    }

    public static void main(String[] args) {
        Solution08 sol = new Solution08();

        Scanner input = new Scanner(System.in);
        //Display How many people and scan int
        System.out.print("How many people? ");
        int people = input.nextInt();

        //Display how many pizzas they have and scan int
        System.out.print("How many pizzas do you have? ");
        int pizzas = input.nextInt();

        //Display how many slices per pizza and scan int
        System.out.print("How many slices per pizzas? ");
        int slices = input.nextInt();

        //Display the people with how many pizzas and Calculate and display how many (slices total)
        int totalSlices = pizzas * slices;
        System.out.print(people + " people with " + pizzas + " pizzas (" + totalSlices + " slices)\n" );

        //Display the amount of pieces each person gets COMES OUT EVEN
        sol.calculatePieces(totalSlices, people);

        sol.calculateLeftover(people, totalSlices);




    }
}
