package CC;

import java.util.Scanner;
import java.util.stream.IntStream;

public class CouponFlat {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        IntStream.range(0,scanner.nextInt()).forEach(i->{
            int val=scanner.nextInt();
            System.out.println(val/10>100? val/10:100);
        });
    }
}//1300  130 1200
