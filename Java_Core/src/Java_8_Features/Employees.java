package Java_8_Features;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Employees {
    static void main() {
        List<String> names = Arrays.asList("Sneha", "Janaki", "Suhas", "Rahul");

        //task is to print employees starting with letter S
        //before Java 8
        for (String ename : names) {
            if (ename.startsWith("S")) {
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

        Collections.sort(names, (a, b) -> a.compareTo(b));
        System.out.println(names);

        //Method referencing
        names.stream().map(name -> name.toUpperCase()).forEach(System.out::println);
        names.stream().map(String::toUpperCase).forEach(System.out::println);

        //Stream API
        System.out.println("---------Stream API----------");
        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30);

        // Without streams - fetch numbers greater than 25
        for (Integer num : numbers) {
            if (num > 25) {
                System.out.println(num);
            }
        }

        //with streams - one line
        numbers.stream()
                .filter(num -> num > 25)
                .forEach(System.out::println);

        //filter()
        List<Integer> res = numbers.stream()
                .filter(num -> num > 20)
                .collect(Collectors.toList());

        System.out.println(res);

        //map()
        List<String> empNames = Arrays.asList("sneha", "suhas", "janu");
        List<String> ename = empNames.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(ename);

        // sorted() - asc order
        List<String> lis = empNames.stream()
                .sorted()
                .toList();
        System.out.println(lis);

        //sorted() - desc order
        empNames.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

        //distinct()
        List<Integer> nums =
                Arrays.asList(10, 20, 10, 30, 20);
        nums.stream()
                .distinct()
                .forEach(System.out::println);

        //limit()
        nums.stream()
                .limit(3)
                .forEach(System.out::println);

        //skip()
        nums.stream()
                .skip(2)
                .forEach(System.out::println);

        //forEach()
        nums.stream()
                .forEach(System.out::println);

        //collect()
        nums.stream()
                .collect(Collectors.toSet());

        //reduce()
        int num = nums.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println(num);
    }
}
