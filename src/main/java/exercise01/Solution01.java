package exercise01;/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jacob Cordonero
 */

import java.util.Scanner;

public class Solution01 {
    public static void main(String[] args) {
        //prompts user for their name
        //stores the data in a string
        //concatenates the data into another string
        //prints out the concatenated string
        Scanner input = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = input.nextLine();
        String concatenation = "Hello " + name + ", nice to meet you!";
        System.out.println(concatenation);
    }
}
