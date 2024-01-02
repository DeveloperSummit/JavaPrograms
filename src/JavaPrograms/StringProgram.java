package JavaPrograms;

import javaTutrials.opps.A;

import java.util.*;
import java.util.stream.Stream;


public class StringProgram {

    public static void main(String[] args) {

        String localval="I Love My Country";
        String data []=  localval.split("\\s");


        StringJoiner stringJoiner=new StringJoiner(" ");
        for (int i = data.length-1; i>0; i--) {
            stringJoiner.add(data[i]);
        }
        System.out.println(stringJoiner);



        String palidrone="nitiNa";
        char[] chars = palidrone.toCharArray();
        String datat="";
        for (int i = chars.length-1; i>=0; i--) {
            datat=datat+chars[i];
        }

        if (palidrone.equalsIgnoreCase(datat))
        {
            System.out.println(" Palindrome");

        }else
        {
            System.out.println("Not Palindrome");
        }
//////////////////////////////////////////////////

        /**
         * find out the no of the occurring the character
         * */
        String noOfChar="grass is greener on the other side";
        String replace=  noOfChar.replaceAll(" ","");
        //String[] arrayData=noOfChar.split("\\s");
        char arrayData[]=replace.toCharArray();
        System.out.print(arrayData);
        Map<Character,Integer> list=new HashMap<>();
        int count=0;
        for (int g = 0; g < arrayData.length; g++) {

            if (list.containsKey(arrayData[g]))
            {
                list.put(arrayData[g],list.get(arrayData[g]).intValue()+1);

            }else
            {
                list.put(arrayData[g],1);
            }

            list.entrySet().stream().forEach(e->{
                System.out.println(e);
            });



        }


         Map.Entry<Character, Integer> characterIntegerEntry = list.entrySet().stream().max(Map.Entry.comparingByKey()).get();

          System.out.println("ffff   : "+characterIntegerEntry);




////////////////////////////////////////////////////////////////////////
        int arrayValue[]={2,4,4,4,42,2,2,25,6,1,6};
        int aaaa=arrayValue[0];

        for (int f = 0; f < arrayValue.length; f++) {

           if (aaaa>arrayValue[f])
           {
               aaaa=arrayValue[f];
           }
        }

        //System.out.println("bif value"+aaaa);

        List<Integer> list1=new ArrayList<>();
        list1.add(2);
        list1.add(1);
        list1.add(5);
        list1.add(10);
        list1.add(7);
       // list1.stream().max(list1,Comparator.comparingInt(list1)).get();


    }
}
