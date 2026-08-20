package Java_8_Features.interview_coding_questions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

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

        //Alternate method
        Optional<Integer> opt = nums.stream()
                .max(Integer::compareTo);
        System.out.println(opt.get());

        Optional<Integer> opt2 = nums.stream()
                .min(Integer::compareTo);
        System.out.println(opt2.get());
    }
}
