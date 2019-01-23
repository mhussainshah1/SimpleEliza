package com.company;

import java.util.Scanner;

/**
 * You will be creating an interactive chat-bot type program. Eliza is a therapist program that interacts with the user.
 * Your program will need to evaluate what the user asks and turn the user's input into a question that sounds like the
 * therapist really cares.
 * <p>
 * Your first task is to develop a program with a running loop. If the user types in "I am feeling great" or enter "Q",
 * the program will stop running. Your program should print out the last input (as an output) every time before accepting
 * new input. Make sure you are accommodating for NO case-sensitivity. (Q is the same as q)
 * <p>
 * We will continue to build on top of this application throughout the week.
 */
public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String answer;
        System.out.print("Good day. What is your problem? ");
        while (true) {
            System.out.print("Enter your response here or Q to quit: ");
            answer = keyboard.nextLine().toLowerCase();
            if (answer.equalsIgnoreCase("I am feeling great") | answer.equals("q")) {
                break;
            } else {
                System.out.println(answer);
            }
        }
        System.out.println(">>> END");
    }
}
