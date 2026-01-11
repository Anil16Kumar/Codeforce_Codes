package lambdaExp;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class combining {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> addFunction = (a,b) -> a+b;
        System.out.println(addFunction.apply(1,2));

        Function<Integer,Integer> multiplyBy2 = (x) -> 2*x;
        System.out.println(multiplyBy2.apply(2));

        // combing both function and bifunction:
        System.out.println("-----------");

        Function<Integer,Integer> add10= n->n+10;


        List<Integer> numbers= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        // har number me 10 add karke usko 2 se multiply karte hai.....
        numbers.forEach(n->
                System.out.println(addFunction.andThen(multiplyBy2).apply(n,10))
        );

        // ab har number me 2 multiply karo phir 10 jodo....
        System.out.println("-----------");
        numbers.forEach(n ->
                System.out.println(
                        multiplyBy2.andThen(x -> addFunction.apply(x, 10)).apply(n)
                )
        );

        //----------------using stream------
        System.out.println("-----------");
        numbers.stream()
                .map(n->addFunction.apply(n,10))
                .map(multiplyBy2)
                .forEach(System.out::println);

        System.out.println("-----------");
        numbers.stream()
                .map(multiplyBy2)
                .map(n->addFunction.apply(n,10))
                .forEach(System.out::println);
    }

}
