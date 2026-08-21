package Java_8_Features.interview_coding_questions;

import java.nio.charset.IllegalCharsetNameException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Program to count elements in a list
public class CountElements {
    static void main() {

        List<String> names = Arrays.asList("Sneha","Suhas","Janu","John");
        long c = names.stream()
                .count();
        System.out.println(c);

        // counting elements of a map
        Map<Integer,String> empDetails = new HashMap<>();
        empDetails.put(101,"Sneha");
        empDetails.put(102,"Suhas");
        empDetails.put(103,"Janu");

        //cannot directly apply map.stream() - but can convert map.entrySet(), keySet(), values() to stream()
        long entryCount = empDetails.entrySet()
                .stream()
                .count();

        System.out.println(entryCount);

        long keyCount = empDetails.keySet()
                .stream()
                .count();

        long valuesCount = empDetails.values()
                .stream()
                .count();

        System.out.println("Keys: "+keyCount+" - Values: "+valuesCount);

    }
}
