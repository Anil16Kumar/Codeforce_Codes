package cf;

import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;

public class MinimumTicketPrice {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        Function<int[], Integer> fun=Arr-> Math.min(Arr[0]/Arr[1]*Arr[3], Arr[0]*Arr[2]) + (Arr[0]%Arr[1])*Arr[2];

        System.out.println(fun.apply(new int[]{scanner.nextInt(),scanner.nextInt()
                                                ,scanner.nextInt(),scanner.nextInt()}));


    }
}
