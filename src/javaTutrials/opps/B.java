package javaTutrials.opps;

public class B{



    public static void devide() throws CustumException {
        String s=new String("null");

        throw  new CustumException("dfffffffff");



      //  System.out.println(100/0);

    }
    public static void main(String[] args) {

        try {
            devide();

        }catch (Exception e){
            e.printStackTrace();
        }

        }





}
