package JavaPrograms;

public class PrimeNumberWithSeries {

    public static void main(String[] args) {

        int start=2, end =100;
        int count=0;

        for (int i = start; i <end; i++) {
            count=0;

            for (int j = 2; j<i; j++) {

                if (i%j==0)
                {
                    count++;
                }

            }

            if (count==0)
            {
                System.out.println(i+" Prime Number");
            }else {
               // System.out.println(i+" Not Prime Number");

            }

        }



    }
}
