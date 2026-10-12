/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package looplab;

import java.util.Scanner;


public class LoopLab {

   
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int choice;

        
        do {
           
            System.out.println("   JAVA LOOPS LAB   ");
            System.out.println(" Problem 1. Multiplication Table Generator");
            System.out.println(" Problem 2. Sum of Natural Numbers ");
            System.out.println(" Problem 3. Factorial Calculator ");
            System.out.println(" Problem 4. Even and Odd Numbers");
            System.out.println(" Problem 5. Reverse Digits of a Number");
            System.out.println(" 0. Exit");

            choice = getInt(input, " Enter Your Choice: ");
            
            // Switch statement to lock in the users selected option
            switch (choice) {

                case 1:
                  
                    int number = getInt(input, "Enter a number: ");

                    System.out.println();
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(
                                number + " x " + i + " = " + (number * i)
                        );
                    }
                    System.out.println();
                    break;

                case 2:
                   
                    int n = getInt(input, "Enter a number: ");

                    if (n < 1) {
                        System.out.println();
                        System.out.println(
                                "Please enter a positive integer."
                        );
                    } else {
                        int sum = 0;
                        int i = 1;

                        while (i <= n) {
                            sum = sum + i;
                            i++;
                        }

                        System.out.println();
                        System.out.println("Sum = " + sum);
                    }
                    System.out.println();
                    break;

                case 3:
                    
                    int factNum = getInt(input, "Enter a number: ");

                    if (factNum < 0 || factNum > 20) {
                        System.out.println();
                        System.out.println(
                                "Please enter a number from 0 to 20."
                        );
                    } else {
                        long factorial = 1;
                        int i = 1;

                        do {
                            factorial = factorial * i;
                            i++;
                        } while (i <= factNum);

                        System.out.println();
                        System.out.println(
                                "Factorial = " + factorial
                        );
                    }
                    System.out.println();
                    break;

                case 4:
                   
                    int limit = getInt(input, "Enter a number: ");

                    if (limit < 1) {
                        System.out.println();
                        System.out.println(
                                "Please enter a positive integer."
                        );
                    } else {
                        System.out.println();
                        System.out.print("Even numbers: ");

                        for (int i = 1; i <= limit; i++) {
                            if (i % 2 == 0) {
                                System.out.print(i + " ");
                            }
                        }

                        System.out.println();
                        System.out.print("Odd numbers: ");

                        for (int i = 1; i <= limit; i++) {
                            if (i % 2 != 0) {
                                System.out.print(i + " ");
                            }
                        }

                        System.out.println();
                    }
                    System.out.println();
                    break;

                case 5:
                    
                    int original = getInt(input, "Enter an integer: ");

                    int temp = original;
                    long reversed = 0;

                    while (temp != 0) {
                        int digit = temp % 10;
                        reversed = reversed * 10 + digit;
                        temp = temp / 10;
                    }

                    System.out.println();
                    System.out.println("Reversed: " + reversed);
                    System.out.println();
                    break;

                case 0:
                    // Exit or closes the program
                    System.out.println("Ok bro come back next time");
                    break;

                default:
                 
                    System.out.println();
                    System.out.println("Invalid choice, pls Try again.");
                    System.out.println();
            }

        } while (choice != 0);
        
        // Close the scanner
        input.close();
    }

  
    public static int getInt(Scanner input, String prompt) {
        while (true) {
            System.out.print(prompt);

            if (input.hasNextInt()) {
                return input.nextInt();
            } else {
                System.out.println(
                        "Invalid input, pls enter a whole number."
                );
                input.next();
            }
        }
    }
}