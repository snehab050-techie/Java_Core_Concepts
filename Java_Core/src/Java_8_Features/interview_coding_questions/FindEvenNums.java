package Java_8_Features.interview_coding_questions;

import java.util.Arrays;
import java.util.List;

//Program to Find even numbers
public class FindEvenNums {
    static void main() {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8);

        numbers.stream()
                .filter(num -> num % 2 == 0)
                .forEach(System.out::println);
    }
}
