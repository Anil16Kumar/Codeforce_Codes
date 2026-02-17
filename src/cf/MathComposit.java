package cf;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.IntStream;

public class MathComposit {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        Consumer<Scanner> perfromTestCases=(sc)->{
          int n=sc.nextInt();
            System.out.println(n % 2 == 0 ? "4 " + (n - 4) : "9 " + (n - 9));
        };

        IntStream.range(0,1).forEach(i->perfromTestCases.accept(scanner));
    }
}
