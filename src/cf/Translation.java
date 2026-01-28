package cf;

import java.util.Scanner;
import java.util.function.BiFunction;

public class Translation {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        BiFunction<String, String ,String> func=(str1,str2)->str1.equals(new StringBuilder(str2).reverse().toString())?"YES":"NO";
        System.out.println(func.apply(scanner.next(),scanner.next()));
    }
}
