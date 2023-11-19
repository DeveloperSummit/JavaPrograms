package JavaPrograms;

public class RevrseString {

  private  static   String name="Anuj";



    public static void main(String[] args) {
        String rev="";

       char arrayass[] =name.toCharArray();

        for (int a = arrayass.length-1; a>=0; a--) {
             rev=rev+name.charAt(a);
        }
        System.out.println(rev);

    }


}
