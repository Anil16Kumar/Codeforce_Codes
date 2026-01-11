package cf;

import java.util.Scanner;

public class wordCapital {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.next();

        String answer="";
        answer+=str.charAt(0);
        answer=answer.toUpperCase();
        answer+=str.substring(1,str.length());
        System.out.println(answer);

    }
}
