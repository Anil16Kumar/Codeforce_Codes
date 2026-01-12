package cf;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.IntStream;

public class DetectiveFinder {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();

        Function<int[], Integer> fun=Arr->{
            if(Arr[0]!=Arr[1] && Arr[1]==Arr[2])
                return 1;
            int answer=0;
            for(int i=1;i<Arr.length;i++)
                if(Arr[i]!=Arr[i-1]){
                    answer=i+1;
                    break;
                }
            return answer;
        };

        Consumer<Scanner> perfromTestCases=sc->{
          int n=sc.nextInt();
          int[] Arr=new int[n];
          for(int i=0;i<n;i++)
              Arr[i]=sc.nextInt();
          System.out.println(fun.apply(Arr));

        };

        IntStream.range(0,t).forEach(i->perfromTestCases.accept(scanner));
    }
}
