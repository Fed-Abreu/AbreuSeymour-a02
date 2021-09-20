import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Federico Abreu Seymour
 */
public class Solution21 {
    private void months(int monthNum){
        String month = switch (monthNum) {
            case 1 -> ("January");
            case 2 -> ("February");
            case 3 -> ("March");
            case 4 -> ("April");
            case 5 -> ("May");
            case 6 -> ("June");
            case 7 -> ("July");
            case 8 -> ("August");
            case 9 -> ("September");
            case 10 -> ("October");
            case 11 -> ("November");
            case 12 -> ("December");
            default -> ("not a valid month");
        };
        //Calculate the number and match it with case of the months
        //Display The name of the month is Month
        System.out.print("The name of the month is " + month);

    }
    public static void main(String[] args) {
        Solution21 sol = new Solution21();
        Scanner input = new Scanner(System.in);
        //Display Enter the number of the Month and Scan int
        System.out.print("Please enter the number of the month: ");
        int monthNum = input.nextInt();

        sol.months(monthNum);





    }
}
