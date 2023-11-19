package javaTutrials.opps;

public class PolymorphismConcepts {

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
    }
}
