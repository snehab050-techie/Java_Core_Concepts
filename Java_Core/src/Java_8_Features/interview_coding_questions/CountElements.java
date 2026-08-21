package Java_8_Features.interview_coding_questions;

import java.util.Arrays;
import java.util.List;

//Program to count elements in a list
public class CountElements {
    static void main() {

        List<String> names = Arrays.asList("Sneha","Suhas","Janu","John");
        long c = names.stream()
                .count();
        System.out.println(c);

    }
}
