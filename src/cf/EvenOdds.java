package cf;

import java.util.Scanner;
import java.util.function.BiFunction;

public class EvenOdds {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        long n=scanner.nextLong(), k=scanner.nextLong();
        long mid=(n+1)/2;
        if(k>mid){
            System.out.println(2*(k-mid));
        }
        else{
            System.out.println(2*k-1);
        }
    }
}
