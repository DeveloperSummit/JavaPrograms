package JavaPrograms;

public class PalidromeNumber {

    private static  int number =111121111;
    private static  int revrseNumber,newNumber;
    private static  int numberTemp=number;

    public static void main(String[] args) {

        while (number!=0)
        {
            revrseNumber=number%10;
            newNumber=newNumber*10+revrseNumber;
            number=number/10;
        }

        if (numberTemp==newNumber)
        {
            System.out.println("Palindrome");
        }else {
            System.out.println(" not Palindrome");

        }

    }


}
