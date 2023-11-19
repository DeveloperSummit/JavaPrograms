package JavaPrograms;

public class factorialbyRecurasion {

   static int factNumberr=1;


    public static void main(String[] args) {


        factorialbyRecurasion factorialNumber=new factorialbyRecurasion();
        int factorialNumberdd=  factorialNumber.factorialNumber(5);
        System.out.println("factorial Data  "+factorialNumberdd);


    }

    private  int factorialNumber(int factNumber)
    {

        if (factNumber>=1){
            factNumberr=factNumberr*factNumber;
            factNumber=factNumber-1;
           // System.out.println("factNumber "+factNumber);
            factorialNumber(factNumber);
        }


        return  factNumberr;
    }




}
