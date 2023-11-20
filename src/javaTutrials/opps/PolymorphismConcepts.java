package javaTutrials.opps;

public class PolymorphismConcepts implements PollyInterface {
    public void show()
    {
        System.out.println("show method");
    }


    public void show(int x)
    {
        System.out.println("xxHello"+x);
    }

    public  void show(String y)
    {
        System.out.println("yyHello");

    }

    public static void main(String[] args) {

        PolymorphismConcepts polymorphismConcepts=new PolymorphismConcepts();
        polymorphismConcepts.show('a');
        polymorphismConcepts.show();
    }
}
