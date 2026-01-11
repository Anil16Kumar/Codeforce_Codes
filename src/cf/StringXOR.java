package cf;

import java.util.Scanner;

public class StringXOR {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str1=scanner.next();
        String str2=scanner.next();
        String answer="";

        for(int i=0;i<str1.length( );i++){
            if(str1.charAt(i)!=str2.charAt(i))
                answer+="1";
            else
                answer+="0";
        }

        System.out.println(answer);
    }
}
