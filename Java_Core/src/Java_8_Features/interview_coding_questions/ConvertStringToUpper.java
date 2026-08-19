package Java_8_Features.interview_coding_questions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Program to Convert strings to uppercase
public class ConvertStringToUpper {
    static void main() {

        Set<String> names = new HashSet<>();
        names.add("Sneha");
        names.add("Suhas");
        names.add("Janu");

        List<String> lis1 = names.stream()
                .map(name -> name.toUpperCase())
                .toList();

        //Method references
        List<String> lis2 = names.stream()
                .map(String::toUpperCase)
                .toList();

        System.out.println(lis2);
    }
}
