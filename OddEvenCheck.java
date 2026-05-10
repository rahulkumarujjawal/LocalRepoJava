package LocalRepoJava;

import java.util.Scanner;

public class OddEvenCheck {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        

        // Check odd or even
        if (number % 2 == 0) {
            System.out.println(number + " is Even Number");
        } else {
            System.out.println(number + " is Odd Number");
        }

        // Close scanner
        sc.close();
    }
    
}
