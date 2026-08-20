package Java_8_Features.interview_coding_questions;

import java.util.*;

//Program to find unique elements in a list
public class FindUniqueElements {
    static void main() {

        List<Integer> nums = Arrays.asList(20,30,50,30,20,78,92,65);
        List<Integer> s = nums.stream()
                        .filter(n->Collections.frequency(nums,n)==1)
                                .toList();

        System.out.println(s);

    }
}
