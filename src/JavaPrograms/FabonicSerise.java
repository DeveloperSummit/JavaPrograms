package JavaPrograms;

public class FabonicSerise {

 private  static int a=0,b=1,c;


    public static void main(String[] args) {
        System.out.print(a+","+b);

        for (int i = 1; i <5; i++) {
            c=a+b;
            System.out.print(","+c);
            a=b;
            b=c;
        }

    }
}
