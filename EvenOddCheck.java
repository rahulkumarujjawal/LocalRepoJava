package LocalRepoJava;

import java.util.Scanner;

public class EvenOddCheck {

    public static void main(String[] args) {

        // Scanner object user input lene ke liye
        Scanner sc = new Scanner(System.in);

        // User se number lena
        System.out.print("Enter a number: ");

        int number = sc.nextInt();

        // Even ya Odd check
        if (number % 2 == 0) {

            System.out.println(number + " is Even Number");

        } else {

            System.out.println(number + " is Odd Number");
        }

        // Scanner close
        sc.close();
    }
}
