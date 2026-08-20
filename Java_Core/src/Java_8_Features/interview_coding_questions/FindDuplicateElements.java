package Java_8_Features.interview_coding_questions;

import java.util.*;

public class FindDuplicateElements {
    static void main() {

        List<Integer> nums = Arrays.asList(78,95,30,95,78,10,56);

        Set<Integer> seen = new HashSet<>();

        //method 1
       List<Integer> result = nums.stream()
                .filter(n -> !seen.add(n)) // add() returns true if the set 'seen' did not already contain the specified element
                .distinct()
                .toList();

        System.out.println(result);

        //method 2
        List<Integer> res = nums.stream()
                .filter(n->Collections.frequency(nums, n) > 1)
                .distinct()
                .toList();

        //Collections.frequency(nums, n) returns the frequency of occurrence of n in list- nums

        System.out.println("-----");
        System.out.println(res);

    }
}
