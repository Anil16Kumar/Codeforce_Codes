package lambdaExp;

import java.util.*;
import java.util.stream.IntStream;

public class comparators {
    public static void main(String[] args) {
        List<Integer> lst = Arrays.asList(11, 2, 34, 10, 22);

        Collections.sort(lst, (a, b) -> b - a);
        System.out.println(lst);



    }
}
