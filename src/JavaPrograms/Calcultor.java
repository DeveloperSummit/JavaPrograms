package JavaPrograms;

import java.util.Scanner;

public class Calcultor {


    public static void main(String[] args) {


        String inputStr;
        do {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter the first value");
            int first=scanner.nextInt();
            System.out.println("Enter the second value");
            int secound=scanner.nextInt();
            System.out.println("please enter the symbol * ,+ , -, /");
            String sybmole=scanner.next();
            int totalvalue=0;


        switch (sybmole)
        {
            case "*":
               totalvalue= first*secound;
                System.out.println("total value "+totalvalue);
               break;

            case "+":
                totalvalue= first+secound;
                System.out.println("total value "+totalvalue);
                break;
            case "-":
                totalvalue= first-secound;
                System.out.println("total value "+totalvalue);
                break;
            default:
            {
                System.out.println("you are chose the wrong symbol");
            }
        }

        System.out.println("if you want to continue press Y and N");
        inputStr=scanner.next();
        }while (inputStr.equals("Y")|| inputStr.equals("Yes") || inputStr.equals("y") );


    }
}
