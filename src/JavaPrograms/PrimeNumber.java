package JavaPrograms;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        int count = 0;

        int m=number/2;

        if (number == 0 || number == 1) {
            System.out.println("it's not prime number");
        } else {
            for (int i = 2; i < number; i++) {

                if (number % i == 0) {
                    count++;
                }

            }

            if (count == 0) {
                System.out.println("prime number");
            } else {
                System.out.println("not prime number");
            }

        }
    }



}
