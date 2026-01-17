package CC;

import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Function;

public class AQI {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        BiFunction<Scanner,Integer,String> bfunc=(sc,val)->{
          val=sc.nextInt();
            String string = val < 100 ? "YES" : "NO";
            return string;
        };
        System.out.println(bfunc.apply(scanner,0));
    }
}
