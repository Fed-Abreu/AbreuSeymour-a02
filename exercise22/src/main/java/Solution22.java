import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Federico Abreu Seymour
 */

public class Solution22 {
    private void highestNum(int num1, int num2, int num3) {
        String numResult = ("The largest number is ");
        //Determine if all ;the numbers  different by using if num1 = num2 or num2 = num3 or num3 = num 1 else end program
        if (num1 == num2 || num2 == num3 || num3 == num1) {
            System.exit(0);
        } else {
            //Calculate highest number 1 by using if num1 > num2 and num1 > num3 Display
            if (num1 > num2 && num1 > num3) {
                System.out.print(numResult + num1);
            }

            //else if num2 > num3 Display number
            else if (num2 > num3) {
                System.out.print(numResult + num2);
            }

            //else num3 is largest Display number
            else {
                System.out.print(numResult + num3);
            }

        }
    }
    public static void main(String[] args) {
        Solution22 sol = new Solution22();
        Scanner input = new Scanner(System.in);
        //Display Enter the first number and Scan int
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();

        //Display Enter the second number and Scan int
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        //Display Enter the third number and Scan int
        System.out.print("Enter the third number: ");
        int num3 = input.nextInt();

        sol.highestNum(num1, num2, num3);


    }
}
