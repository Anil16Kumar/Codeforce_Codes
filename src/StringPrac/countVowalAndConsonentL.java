package StringPrac;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class countVowalAndConsonentL {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();

        Function<String, Integer> fun = s ->
                (int) Arrays.stream(s.toLowerCase().split(""))
                        .filter(ch -> ch.equals("a") || ch.equals("e") ||
                                ch.equals("i") || ch.equals("o") ||
                                ch.equals("u"))
                        .count();

        System.out.println(
                Arrays.stream(str.split(" "))
                        .mapToInt(word->fun.apply(word))
                        .sum()
        );
    }
}
