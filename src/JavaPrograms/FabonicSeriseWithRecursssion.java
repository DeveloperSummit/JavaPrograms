package JavaPrograms;

public class FabonicSeriseWithRecursssion {

  static  int a=0,b=1,c;

    public static void main(String[] args) {
        FabonicSeriseWithRecursssion fabonicSeriseWithRecursssion=new FabonicSeriseWithRecursssion();
        System.out.print(a+","+b);

        fabonicSeriseWithRecursssion.fabonicserise(5);
    }

    private  void fabonicserise(int number) {
        if (number>1)
        {
            c=a+b;
            System.out.print(","+c);
            a=b;
            b=c;
            fabonicserise(number-1);
        }





    }
}
