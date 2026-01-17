package cf;

import java.util.Scanner;
import java.util.Stack;

public class BrozeCode {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String code=scanner.next();

        Stack<Character> stkack=new Stack<>();
        for(int i=code.length()-1;i>=0;i--)
            stkack.add(code.charAt(i));


        String answer="";
        String temp="";
        while(!stkack.isEmpty()){
            temp+=stkack.pop();
            if(temp.equals("-.")){
                answer+="1";
                temp="";
            }
            else if(temp.equals("--")){
                answer+="2";
                temp="";
            }
            else if(temp.equals(".")){
                answer+="0";
                temp="";
            }
        }
        System.out.println(answer);

    }
}
