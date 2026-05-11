package LocalRepoJava;

import java.util.Scanner;

public class FibonacciUserInput {

    public static void main(String[] args) {

        // User se input lene ke liye Scanner object banaya
        Scanner sc = new Scanner(System.in);

        // User se pooch rahe hain kitne numbers print karne hain
        System.out.print("Enter number: ");

        int n = sc.nextInt();

        // Fibonacci ke first 2 numbers
        int first = 0;
        int second = 1;

        // Next number store karne ke liye variable
        int next;

        System.out.println("Fibonacci Series:");

        // Loop n times chalega
        for (int i = 1; i <= n; i++) {

            // Current number print karo
            System.out.print(first + " "); 

            // Next number calculate karo
            next = first + second;

            // Values update karo
            first = second;

            second = next;
        }

        // Scanner close
        sc.close();


        System.out.println("Hey R_ujjawal_Sharma");

        System.out.println("Hey Rahul ujjawal sharama_kumar");

    }
} 
