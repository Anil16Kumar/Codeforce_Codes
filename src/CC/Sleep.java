package CC;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class Sleep {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        Predicate<Integer> predi=num->num<7;
        Function<Integer,String> func=num->predi.test(num)?"Yes":"NO";
        Consumer<Scanner> perfromTestCases=(sc)->{
            System.out.println(func.apply(sc.nextInt()));
        };
        IntStream.range(0,scanner.nextInt()).forEach(i->perfromTestCases.accept(scanner));
    }
}
