import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Federico Abreu Seymour
 */
public class Solution16 {
    private void ageChecker (int age){
        //Calculate using ternary operator if user is 16 or older them Display if user old enough or if user isn't old enough
        String ageChecked = (age >= 16)?"You are old enough to legally drive." : "You are not old enough to legally drive.";
        System.out.print(ageChecked);
    }
    public static void main(String[] args) {
        Solution16 sol = new Solution16();
        Scanner input = new Scanner(System.in);

        //display what is age? Scan as int
        System.out.print("What is your age? ");
        int age = input.nextInt();
        //Calculate using ternary operator if user is 16 or older them Display if user old enough or if user isn't old enough
        sol.ageChecker(age);

    }
}
