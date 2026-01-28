package cf;

import javax.script.ScriptContext;
import java.util.Scanner;
import java.util.function.BiFunction;

public class iq {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        BiFunction<Scanner, Integer, String> bfunct=(sc,num)->(num+7)>170?  "Yes": "No";

        System.out.println(bfunct.apply(scanner,scanner.nextInt()));
    }
}
