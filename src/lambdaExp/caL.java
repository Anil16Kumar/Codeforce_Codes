package lambdaExp;


import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;


public class caL {

    public static void main(String[] args) {
            Function<Integer,Integer> squareFunction=
                (x)->x*x;

            BiFunction<Integer,Integer,Integer> addFunction=
                (a, b)->a+b;

        System.out.println(addFunction.apply(1,2));
        System.out.println(squareFunction.apply(5));

//        =======================
//        ===========
//        =============

        Consumer<String> consumer=s -> System.out.println("only consumes NO return... '"+s+"'");
        consumer.accept("only accapt argument");
        /*
        --
         */
        List<Integer> numbers=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Consumer<Integer> multiplyBy2 = integer -> System.out.println(integer*2);
        numbers.forEach(multiplyBy2);
        /*
        --
         */
        BiConsumer<Integer,Integer> addConsume = (a,b) -> System.out.println(a+b);
        addConsume.accept(1,2);



    }
}
