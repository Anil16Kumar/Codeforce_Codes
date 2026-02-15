package cf;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.IntStream;

public class StringCharSwap {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        Consumer<Scanner> perfromTestCases=sc->{
            String a=sc.next();
            char[] aa=a.toCharArray();

            String b=sc.next();
            char[] bb=b.toCharArray();

            if(aa[0]!=bb[0]) {
                char temp = aa[0];
                aa[0] = bb[0];
                bb[0] = temp;
            }

            System.out.println(new String(aa)+" "+new String(bb));


        };

        IntStream.range(0,scanner.nextInt()).forEach(i->perfromTestCases.accept(scanner));
    }
}
