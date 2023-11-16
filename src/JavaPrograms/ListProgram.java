package JavaPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListProgram {

    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        Collections.sort(cars);

        cars.stream().forEach(e->{
            System.out.println(e);
        });

        List<String> list222=new ArrayList<>();

        list222.add("Apple");
        list222.add("Apple");
        list222.add("fig");
        list222.add("fig");
        list222.add("Graphics");
        list222.add("Banana");
        list222.add("Banana");
        list222.add("Banana");

        List<String> collect = list222.stream().distinct().collect(Collectors.toList());
        collect.forEach(e->{
            System.out.println("duplicate "+e);
        });

        Stream.of("anuj","kuldeep","ravi").forEach(e->{
            System.out.println(e.toUpperCase());
        });




    }
}
