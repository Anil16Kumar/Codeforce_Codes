package cf;

import java.util.Scanner;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.IntStream;

public class AvalRoom {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
//        while (t--!=0){
//            int n=scanner.nextInt();
//            int m=scanner.nextInt();
//            if(m-n>1)
//                count++;
//        }
//        System.out.println(count);

//        int t=scanner.nextInt();

        Function<int[],String> fun=arr->{
            return arr[0]>arr[1] && arr[0]>arr[2]?"Alice": arr[1]>arr[0] && arr[1]>arr[2]?"Bob":"Charlie";
        };

        Consumer<Scanner> perfromTestCases= sc->{

            System.out.println(fun.apply(new int[]{sc.nextInt(),sc.nextInt(),sc.nextInt()}));
        };

        IntStream.range(0,t).forEach(i->perfromTestCases.accept(scanner));

        Function<int[], String> fun1=(Arr)->{
            if(Arr[0]>10)
                return "true";
            else
                return "false";
        };

        BiPredicate<Integer, Integer> isAvailable = (n, m) -> m - n > 1;

//        int[] Arr=new int[3]{};
        System.out.println(fun1.apply(new int[]{scanner.nextInt(),scanner.nextInt(),scanner.nextInt()}));

        long count = IntStream.range(0, t)
                .mapToObj(i -> new int[]{scanner.nextInt(), scanner.nextInt()})
                .filter(arr -> isAvailable.test(arr[0], arr[1]))
                .count();

        System.out.println(count);
    }
}
