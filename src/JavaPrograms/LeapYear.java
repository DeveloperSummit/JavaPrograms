package JavaPrograms;

public class LeapYear {

    private static  final int year=2940;

    public static void main(String[] args) {

        if (year%400==0)
        {
            System.out.println("Leap year");

        }else
        {
            System.out.println("Not Leap year");
        }
    }
}
