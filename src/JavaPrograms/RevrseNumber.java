package JavaPrograms;

public class RevrseNumber {

    public static void main(String[] args) {

        int mynumber=1234;
        int data;
        int reminder=0;


        while (mynumber!=0) {
            data = mynumber % 10;
            reminder=reminder*10+data;
            mynumber = mynumber / 10;

        }

        System.out.println("Reverse Number "+reminder);

    }
}
