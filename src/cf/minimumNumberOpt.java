package cf;

import java.util.Scanner;

public class minimumNumberOpt {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println(actualTask(scanner.next()));
    }
    public static String actualTask(String num){
        String answer = "";

        for (int i = 0; i < num.length(); i++) {
            char ch = num.charAt(i);
            int digit = ch - '0';

            if (digit >= 5) {
                digit = 9 - digit;
            }

            if (i == 0 && digit == 0) {
                digit = ch - '0';
            }

            answer += digit;
        }

        return answer;
    }
}
