package cf;

import java.util.Scanner;
import java.util.function.BiFunction;

public class DominoPiling {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        BiFunction<Integer,Integer,Integer> bFun=(n,m)->  (int)(n*m)/2;

        int n=scanner.nextInt();
        int m=scanner.nextInt();
        System.out.println(bFun.apply(n,m));
        //BiFunction<Integer,Integer,Integer> bFun1= Math::max;
    }
}
