package javaTutrials.opps;

import java.util.StringJoiner;

public class A {

    public static void main(String[] args) {

       String sentense="My Name is Anuj Kumar";
       String[] data= sentense.split("\\s");
       StringJoiner joinNames = new StringJoiner(",","[","]"); // passing comma(,) as delimiter

        for (int i = data.length-1; i>0; i--) {
            joinNames.add(data[i]);
        }
        System.out.println(joinNames);


    }
}
