import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Federico Abreu Seymour
 */
public class Solution14 {
    private void passChecker (String password){
        //If pass word equals abc$123 CASE SENSITIVE display Welcome!
        if (password.equals("abc$123")) {
            System.out.print("Welcome! ");

        }
        //else is password is incorrect display I don't know you.
        else {
            System.out.print("I don't know you. ");
        }
    }
    public static void main(String[] args) {
        Solution14 sol = new Solution14();
        Scanner input = new Scanner(System.in);
        //Display What is password Scan double
        System.out.print("What is the password? ");
        String password = input.next();

        sol.passChecker(password);
    }
}
