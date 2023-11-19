package JavaPrograms.sort;

public class BubbleSort {

    private static  int arrayValue []={23,12,45,5,7,1,34,9};
    private static int pointindex=arrayValue[1];

    public static void main(String[] args) {

        for (int i = 0; i < arrayValue.length; i++) {
            if (pointindex>arrayValue[i])
            {
                pointindex=arrayValue[i];
            }
            System.out.print(pointindex+",");
        }


    }
}
