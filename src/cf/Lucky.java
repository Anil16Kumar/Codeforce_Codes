package cf;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.IntStream;

public class Lucky {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        Function<String,String> func=(num)->{
            int i=0,j=num.length()-1;
            int num1=0,num2=0;
            while(i<j){
                num1+=(num.charAt(i)-'0');
                num2+=(num.charAt(j)-'0');
                i++;
                j--;
            }
            String answer= num1==num2? "YES":"NO";
            return answer;
        };

        Consumer<Scanner> perfromTestCases=sc->{
            System.out.println(func.apply(sc.next()));
        };

        IntStream.range(0,scanner.nextInt()).forEach(i->perfromTestCases.accept(scanner));
    }
}
