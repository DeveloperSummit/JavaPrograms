package JavaPrograms;

import java.util.Arrays;

public class ArrayInJava {

    private static int anInt[]=new int[3];
    private  static int anIntee[]=new int[]{2,4,6};
    private  static int anInteeee[]={1,3,33,3,3};


    public static void main(String[] args) {



        Arrays.stream(anInteeee).forEach(e->{
            System.out.println(e);
        });
    }
}
