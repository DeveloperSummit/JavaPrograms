package javaTutrials.datatype;

public class JavaDataType {

    /**
     * Memory decide by the JVM at the RunTime.
     *
     * */

    private  boolean aBoolean=true; // default value = false , size = 1 bit
    private char aChar; // default value = \u0000 , size = 2 byte , [-2^16-1 to 2-1^16-1]
    private static short aShort; // default value = 0 , size = 2 byte , [-2^16-1 to 2-1^16-1]
    private int anInt; // default value = 0 , size = 4 byte ,  [-2^32-1 to 2-1^32-1]
    private float aFloat; // default value = 0.0f , size = 4 byte , [-2^32-1 to 2-1^32-1]
    private long aLong;  // default value = 0.0L , size = 8 byte , [-2^64-1 to 2-1^64-1]
    private double aDouble; //default value = 0.0 , size = 8 byte, [-2^64-1 to 2-1^64-1]
    private String string="Anuj"; // default  value=null , size  = 2 byte * 4 character = 8 byte

    private  byte aByte;

    public static void main(String[] args) {

        localVariable();
        instanceVariable();
        staticVariable();
        JavaDataType  javaDataType=new JavaDataType();
        javaDataType.m1();
    }



    private static void instanceVariable() {
        /**
         * 1. it's take the memory in Heap area at the time of the object creation & it's release the memory at the time object delete.
         * 2. we can be used the access modifier with instance variable
         * 3. you can use the instance variable with in method through the class object
         *  // we can not access the instance variable  in static variable & it's need to crete the obj
         * 4. it's having the default value.
         * 5. it's need to create the object
         * */


        // we can access the static value
        System.out.println(aShort);
        // we can't access the non- static variable in static method & it's need to create the objetc
        JavaDataType javaDataType=new JavaDataType();
        System.out.println(javaDataType.aFloat);

    }

    public  void m1(){
        System.out.println("default boolean value : "+aBoolean);
    }


    public  static  void  localVariable()
    {
        /**
         * 1. it's take the memory in the Stack Memory
         * 2. no need data access modifies
         * 3. you can not used out of the method / constructor / block
         * 4. local variable not have any default value
         * 5. if you are using the local variable need to initialize the value of the data type variable
         * */

        int d=10;
        System.out.println("Local variable "+d);

    }
    private static void staticVariable() {

        /**
         * 1. Java Virtual Machine (JVM) are responsible for creating the memory for static variable & instance variable and local variable,
         *  in non-Heap memory area is allocated for its static variables.
         * This memory is part of the class definition,
         * it exists for the entire lifetime of the program.
         * 2. memory for static variables is allocated in a special area known as the "Method Area" or "Class Area" in the JVM.
         * 3.it's taking the only one time memory in project lifecycle.
         * if you update the value of the static variable. it's indicate the latest value.
         * 4.we can use the access modifier for the static variable no need to create the object and we can get the value of the static variable in non-static or static method.
         * 5.Non-Heap memory have the class level information. memory name -> class - Area
         *
         * */

    }


}
