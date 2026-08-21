package Java_8_Features.interview_coding_questions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

//Program to find sec highest number
public class FindSecHighestNum {
    static void main() {

        List<Integer> numbers = Arrays.asList(20,67,48,92,72,82);

        // method 1
        List<Integer> sortedList = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println(sortedList.get(1));

        // method 2
        Optional<Integer> n = numbers.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();

        System.out.println(n.get());
    }
}
