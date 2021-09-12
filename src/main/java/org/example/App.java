/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Tim Phung
 */
package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        int num1=0;
        int num2=0;
        //User input & prompt
        System.out.println("What is the first number? ");
        String str1 = scan.nextLine();
        System.out.println("What is the second number? ");
        String str2 = scan.nextLine();

        //Convert strings
        num1 = Integer.parseInt(str1);
        num2 = Integer.parseInt(str2);

        //Print statement
        System.out.println( num1+ " + " +num2+ " = " +(num1 + num2)+ '\n' +num1+ " - " +num2+ " = " +(num1-num2)+ '\n' +num1+ " * " +num2+ " = " +(num1*num2)+ '\n' +num1+ " / " +num2+ " = " +(num1/num2) );

    }
}
