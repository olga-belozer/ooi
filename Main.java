package com.company;
import java.util.Scanner;


public class Main {
    static int toInt(String key) {
        switch (key) {
            case "1":
            case "I":
                return 1;
            case "2":
            case "II":
                return 2;
            case "III":
            case "3":
                return 3;
            case "IV":
            case "4":
                return 4;
            case "V":
            case "5":
                return 5;
            case "VI":
            case "6":
                return 6;
            case "VII":
            case "7":
                return 7;
            case "VIII":
            case "8":
                return 8;
            case "IX":
            case "9":
                return 9;
            case "X":
            case "10":
                return 10;

            default:
                System.out.printf("Error! Enter correct operator");
                return 0;
        }
    }
    public static void main(String[] args) {
        String strnum1;
        String strnum2;
        int num1,num2,ans;
        // write your code here
        System.out.println("hello");
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter two numbers ");
        System.out.print("\nEnter an operator (+, -, *, /): ");
       strnum1 = reader.next();
         strnum2 = reader.next();
                char op = reader.next().charAt(0);
        num1 = toInt(strnum1);
        num2 = toInt(strnum2);
        if(num1*num2 == 0) return;
        switch(op) {
            case '+': ans = num1 + num2;
                break;
            case '-': ans = num1 - num2;
                break;
            case '*': ans = num1 * num2;
                break;
            case '/': ans = num1 / num2;
                break;
            default:  System.out.printf("Error! Enter correct operator");
                return;
        }
        System.out.print("\nThe result is given as follows:\n");
        System.out.printf(num1 + " " + op + " " + num2 + " = " + ans);
    }

}
