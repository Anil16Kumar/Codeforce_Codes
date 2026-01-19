package CC;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class GenralClass {
    public static void main(String[] args) {
        Climate();
    }

    public static void Climate(){
        Scanner scanner = new Scanner(System.in);
        IntStream.range(0, scanner.nextInt())
                .map(i -> scanner.nextInt())
                .mapToObj(temp -> temp > 20 ? "HOT" : "COLD")
                .forEach(System.out::println);
    }

    public static void ATM(){
        Scanner scanner=new Scanner(System.in);

        BiFunction<Integer,Double,Double> biFunc=(num1,dou1)->num1>dou1?dou1:num1%5==0?dou1-(double)(num1+0.5):dou1;
        Consumer<Scanner> perfromTestCases=sc->{
            System.out.println(biFunc.apply(sc.nextInt(),sc.nextDouble()));
        };
        IntStream.range(0,1).forEach(i->perfromTestCases.accept(scanner));
    }

    public static void Volume(){
        Scanner scanner=new Scanner(System.in);
        IntStream.range(0, scanner.nextInt())
                .map(i -> Math.abs(scanner.nextInt()-scanner.nextInt()))
                .map(Math::abs)
                .forEach(System.out::println);
    }
    public static  void maxHeight(){
        Scanner scanner=new Scanner(System.in);
        List<Integer> lst= new ArrayList<>();
        lst.add(scanner.nextInt());
        lst.add(scanner.nextInt());
        Integer answer=lst.stream()
                .mapToInt(Integer::intValue)
                .max()
                .orElse(0);
        System.out.println(answer);
    }
    public static void spamAccount(){
        Scanner scanner=new Scanner(System.in);

        Function<int[], String> func=Arr->Arr[0]>Arr[1]*10?"YES":"NO";

        Consumer<Scanner> perfromTestCases=sc->{
            System.out.println(func.apply(new int[]{sc.nextInt(),sc.nextInt()}));
        };

        IntStream.range(0,scanner.nextInt()).forEach(i->perfromTestCases.accept(scanner));
    }


}
