package cf;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.IntStream;

public class sameDifference {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        Function<int[],Integer> function=Arr->{
            int count=0;
          for(int i=0;i<Arr.length-1;i++)
              for(int j=i+1;j<Arr.length;j++)
                  if(Arr[j]-Arr[i]==j-i)
                      count++;
          return count;
        };

        Consumer<Scanner> perfromTestCases=sc->{
          int n=sc.nextInt();
          int Arr[]=new int[n];
          for(int i=0;i<n;i++)
              Arr[i]=sc.nextInt();

          System.out.println(function.apply(Arr));

        };

        IntStream.range(0,scanner.nextInt()).forEach(i->perfromTestCases.accept(scanner));
    }
}
