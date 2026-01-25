package cf;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.IntStream;

public class SumCount {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        Consumer<Integer> taskPerfrom = num -> {

            int times = 1;
            ArrayList<Integer> number = new ArrayList<>();

            while (num != 0) {
                if (num % 10 != 0) {
                    number.add((num % 10) * times);
                }
                num = num / 10;
                times = times * 10;
            }

            System.out.println(number.size());
            for (int val : number)
                System.out.print(val + " ");
            System.out.println();
        };


        Consumer<Scanner> perfromTestCases=sc->{
            taskPerfrom.accept(sc.nextInt());
        };

        IntStream.range(0,scanner.nextInt()).forEach(i->perfromTestCases.accept(scanner));
    }
}
