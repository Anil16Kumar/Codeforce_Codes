package cf;

import java.util.Scanner;
import java.util.Stack;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.IntStream;

public class stackBracketBlance {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        Function<String,Integer> function=str->{
            Stack<Character> stk=new Stack<>();
            for(int i=0;i<str.length();i++){
                if(!stk.empty() && stk.peek().equals('(') && str.charAt(i)==')')
                    stk.pop();
                else
                    stk.push(str.charAt(i));
            }
            if(stk.empty())
                return 0;
            return stk.size()/2;
        };

        Consumer<Scanner> perfromTestCases=sc->{
          int n=sc.nextInt();
          String str=sc.next();
            System.out.println(function.apply(str));
        };

        IntStream.range(0,scanner.nextInt()).forEach(i->perfromTestCases.accept(scanner));
    }
}
