package cf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();

        while(n--!=0){
            String word=scanner.next();

            if(word.length()>10){
                String answer = "";
                answer += word.charAt(0);
                int len=word.length()-2;
                answer += len;
                answer += word.charAt(word.length()-1);
                System.out.println(answer);
            }
            else
                System.out.println(word);
        }
    }
}
