package cf;

import java.util.Scanner;
import java.util.function.Function;

public class Football {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        Function<String, String> funct=str->{
            int count=1;
          for(int i=1;i<str.length();i++){
              if(str.charAt(i-1)==str.charAt(i))
                  count++;
              else
                  count=1;

              if(count>=7)
               return "YES";

          }
          return "NO";
        };

        System.out.println(funct.apply(scanner.next()));
    }
}
