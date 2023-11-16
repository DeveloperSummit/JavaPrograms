package JavaPrograms;

public class SwapTwoNumber {
    public static void main(String[] args) {

        int a=10;
        int b=20;
        int c=0;

         c=b;
         b=a;
         a=c;


        System.out.println("a"+a+"::"+"b "+b);

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("a"+a+"::"+"b "+b);




    }
}
