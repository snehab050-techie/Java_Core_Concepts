package Java_8_Features;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Employees {
    static void main() {
        List<String> names = Arrays.asList("Sneha","Janaki","Suhas","Rahul");

        //task is to print employees starting with letter S
        //before Java 8
        for(String ename : names){
            if(ename.startsWith("S")){
                System.out.println(ename);
            }
        }

        //alternatively before Java 8
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        //Imagine if we have complex operations like , filtering employees based on name, salary, then sorting them, then concerting
        // those emp names to uppercase...then collecting them as a list
        //Lot of complexities
        // So, Java 8 introduced a functional way of programming

        //get names starting with S
        names.stream()
                .filter(n -> n.startsWith("S"))
                .forEach(System.out::println);

        Collections.sort(names, (a,b)-> a.compareTo(b));
        System.out.println(names);

        //Method referencing
        names.stream().map(name -> name.toUpperCase()).forEach(System.out::println);
        names.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
