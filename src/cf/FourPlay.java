package cf;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.IntStream;

public class FourPlay {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        Function<int[],String> function=Arr->{
          int max1=Math.max(Arr[0],Arr[1]);
          int max2=Math.max(Arr[2],Arr[3]);

          return (max1>=Arr[2]&&max1<=Arr[3])||(max1<=Arr[2]&&max1>=Arr[3]) ||
                  (max2>=Arr[0]&&max2<=Arr[1])||(max2<=Arr[0]&&max2>=Arr[1]) ? "YES":"NO";
        };

        Consumer<Scanner> performTestCase=sc->{
            System.out.println(function.apply(new int[]{sc.nextInt(),sc.nextInt(), sc.nextInt(), sc.nextInt()}));
        };

        IntStream.range(0,scanner.nextInt()).forEach(i->performTestCase.accept(scanner));
    }
}
