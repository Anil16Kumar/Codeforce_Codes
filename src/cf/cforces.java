package cf;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.IntStream;

public class cforces {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        Function<String,Integer> function=str->{
            String temp="codeforces";
            int count=0;
          for(int i=0;i<temp.length();i++){
              if(temp.charAt(i)!=str.charAt(i))
                  count++;
          }
          return count;
        };

        Consumer<Scanner> perfromTestCases=sc->{
            System.out.println(function.apply(sc.next()));
        };

        IntStream.range(0,scanner.nextInt()).forEach(i->perfromTestCases.accept(scanner));
    }
}
