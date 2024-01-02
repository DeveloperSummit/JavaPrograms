package javaTutrials.method_ref;

import java.util.*;
import java.util.stream.Collectors;

public class MethodRefrence extends  Thread {

    @Override
    public void run() {

        for (int i = 1; i <=5; i++) {
            System.out.println("Run method");
        }

    }

    public static void main(String[] args) throws InterruptedException {


        Optional<Integer> integer = Optional.of(1);
        integer.isEmpty();


        System.out.println(integer);
        MethodRefrence methodRefrence=new MethodRefrence();

        for (int i = 1; i <=5; i++) {
            System.out.println("Inside man metho0d");

            Thread.sleep(1);
        }
        methodRefrence.start();





        System.out.println("Hello ");

        Optional<String> data= Optional.of("Anuji");


       Student student[]=new Student[]{new Student(1,"Zakir",34),new Student(2,"Anuj",45),new Student(3,"Kuldeep",55)};

        List<String> collect = Arrays.stream(student).map(Student::getName).collect(Collectors.toList());


        double max = Arrays.stream(student).mapToInt(Student::getMarks).average().getAsDouble();

        Map<Integer, List<Student>> emax = Arrays.stream(student).collect(Collectors.groupingBy(Student::getStudentId));


        for (Map.Entry<Integer, List<Student>> integerListEntry : emax.entrySet()) {
            integerListEntry.getValue().stream().forEach(e -> e.getName());
        }

        System.out.println(collect);
    }
}
