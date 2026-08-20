package Java_8_Features.interview_coding_questions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//Program to find maximum number
public class FindMaxNumber {
    static void main() {
        List<Integer> nums = Arrays.asList(10,30,78,95,36,890);
        List<Integer> res = nums.stream()
                .sorted(Comparator.reverseOrder())
                .distinct()
                .toList();
        System.out.println(res.getFirst()); //prints max number
        System.out.println(res.getLast()); //prints min number
    }
}
