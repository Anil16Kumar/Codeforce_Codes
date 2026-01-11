package lambdaExp;

import java.util.function.BiPredicate;

public class functionLambdaPr {
    public static void main(String[] args) {
        BiPredicate<String,Integer> stringIntegerBiPredicate= (str,len) -> str.length()==len;
        System.out.println(stringIntegerBiPredicate.test("anil",4));


    }
}
