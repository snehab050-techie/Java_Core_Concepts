package Java_8_Features.interview_coding_questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindSum {
    static void main() {

        List<Integer> lis = Arrays.asList(10,20,30,40,50);

        //method 1
        int s1 = lis.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(s1);

        //method 2
        int s2 = lis.stream()
                .reduce(0, (a,b) -> (a+b));
        System.out.println(s2);
    }
}
