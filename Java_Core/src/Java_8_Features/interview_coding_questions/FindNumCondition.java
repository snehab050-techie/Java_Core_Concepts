package Java_8_Features.interview_coding_questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Program to find numbers greater than 50
public class FindNumCondition {
    static void main() {

        List<Integer> nums = Arrays.asList(20,34,50,65,78,92,12,903,675);
        List<Integer> newNums = nums.stream()
                .filter(num -> num > 50)
                .collect(Collectors.toList());
        System.out.println(newNums);

    }
}
