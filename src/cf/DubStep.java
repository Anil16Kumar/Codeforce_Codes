package cf;

import java.util.Scanner;

public class DubStep {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String str=scanner.next();
        String removedWUB=str.replace("WUB"," ");
        int i=0;
        String answer="";
        while(i<removedWUB.length()){
            if(removedWUB.charAt(i) != ' '){
                String temp="";
                while(i<removedWUB.length() && removedWUB.charAt(i) != ' '){
                    temp+=removedWUB.charAt(i);
                    i++;
                }
                temp+=" ";
                answer+=temp;
            }
            i++;
        }
        answer=answer.substring(0,answer.length()-1);
        System.out.println(answer);
    }
}
