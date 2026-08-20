package Java_8_Features.interview_coding_questions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicateElements {
    static void main() {

        List<Integer> nums = Arrays.asList(78,95,30,95,78,10,56);

        Set<Integer> seen = new HashSet<>();

       List<Integer> result = nums.stream()
                .filter(n -> !seen.add(n)) // add() returns true if the set 'seen' did not already contain the specified element
                .distinct()
                .toList();

        System.out.println(result);

    }
}
