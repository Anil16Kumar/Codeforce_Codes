package cf;

import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.stream.IntStream;

public class Dragon {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        BiFunction<int[], Integer,Integer> func=(Arr,val)->{
            int count=0;
            for(int i=1;i<=val;i++)
                if(i%Arr[0]==0 || i%Arr[1]==0 || i%Arr[2]==0 || i%Arr[3]==0 )
                    count++;
            return count;
        };
        Consumer<Scanner> perfromTestCases=sc->{
            System.out.println(func.apply(new int[]{sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt()},sc.nextInt()));
        };

        IntStream.range(0,1).forEach(i->perfromTestCases.accept(scanner));
    }
}
