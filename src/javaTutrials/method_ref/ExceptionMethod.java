package javaTutrials.method_ref;

import javaTutrials.opps.A;

import java.math.BigInteger;

public class ExceptionMethod {

    public static void main(String[] args) {




        BigInteger dd= BigInteger.valueOf(199);
       BigInteger bigInteger=new BigInteger(String.valueOf(dd.intValue()));
        BigInteger secound=new BigInteger(String.valueOf(dd.intValue()));




        int ddd=secound.intValue()+bigInteger.intValue();

        System.out.println(ddd);



        try {
            m1();
        }catch (Exception e)
        {
            System.out.println("New Data");

        }




    }


    private static void m1()
    {
        System.out.println("M1 execute.!");
        int aaa=10/0;
        throw  new RuntimeException("We can not devide the value by zero");


    }
}
