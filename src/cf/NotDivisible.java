package cf;

import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.stream.IntStream;

public class NotDivisible {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        BiFunction<Long,Long,Long> bifunction=(num1,num2)->{
            int count=0;
          for(Long i = 1L; i<=10000000000L; i++){
              if(i%num1!=0)
                  count++;
              if(count==num2)
                  return i;
          }
            return 0L;
        };

        Consumer<Scanner> perfromTestCases=sc -> {
            System.out.println(bifunction.apply((long) sc.nextInt(), (long) sc.nextInt()));
        };

        IntStream.range(0,scanner.nextInt()).forEach(i->perfromTestCases.accept(scanner));
    }
}
