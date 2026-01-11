package lambdaExp;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.*;

public class filterEven {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> collect = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        System.out.println(collect);

        List<Integer> collect1 = Stream.iterate(0, x -> x + 1).limit(101).sorted((a,b)->b-a).skip(1).collect(Collectors.toList());
        System.out.println(collect1);

        List<String> lst1=Arrays.asList("abc","pqr","xyz","stu");
        lst1.forEach(System.out::println);

        Scanner scanner=new Scanner(System.in);
        BiFunction<Integer,Integer,Integer> bFun=(x,y)-> x*y;
        Consumer<Scanner> processTestCases = (s) -> {
            int x=s.nextInt();
            int y=s.nextInt();
            System.out.println(bFun.apply(x,y));
        };

        //IntStream.range(0,6).forEach( i -> processTestCases.accept(scanner));

        Predicate<Integer> pre= num -> num==6;

        Predicate<Integer> num = (i)->i%2==0;
        IntStream.range(0,100).forEach(i-> System.out.println(num.test(i)?i:""));



    }
}
