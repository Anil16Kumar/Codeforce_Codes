package cf;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.IntStream;

public class goodKid {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        Function<int[], Long> function = A -> {
            long maxProduct = 0;

            for(int i = 0; i < A.length; i++) {

                A[i]++;
                long product = 1;
                for(int j = 0; j < A.length; j++)
                    product *= A[j];

                maxProduct = Math.max(maxProduct, product);
                A[i]--;
            }

            return maxProduct;
        };

        Consumer<Scanner> perfromTestCases=sc->{
          int n=sc.nextInt();
          int[] A=new int[n];
          for(int i=0;i<n;i++)
              A[i]=sc.nextInt();
          System.out.println(function.apply(A));
        };

        IntStream.range(0,scanner.nextInt()).forEach(i->perfromTestCases.accept(scanner));
    }
}
