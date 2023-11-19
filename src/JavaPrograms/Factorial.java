package JavaPrograms;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the factorial Number");
        int factorialNumber= scanner.nextInt();
        int totalSum=1;
        for (int i=factorialNumber;i>=1;i--)
        {
            totalSum=totalSum*i;
        }
        System.out.println("factorial  "+totalSum);

    }
}
