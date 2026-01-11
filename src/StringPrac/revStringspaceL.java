package StringPrac;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class revStringspaceL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str=scanner.nextLine();
        int i=0;
        String answer="";
        char[] charArray=str.toCharArray();
        String temp="";
        while(i<str.length()){
            if(charArray[i]==' '){
                temp=reverse(temp);
                answer+=temp;
                answer+=" ";
                temp="";
                i++;
            }

            temp+=charArray[i];
            i++;
            if(i==str.length()){
                temp=reverse(temp);
                answer+=temp;
//                answer+=" ";
                break;
            }
        }
        System.out.println(answer);
        System.out.println("using lambda function: "+reverStringLambda(str));


    }
    public static String reverse(String str){
        int i=0,j=str.length()-1;
        char[] split=str.toCharArray();
        while(i<j){
            char temp=split[i];
            split[i]=split[j];
            split[j]=temp;
            i++;
            j--;
        }
        String answer="";
        for(int ii=0;ii<str.length();ii++)
            answer+=split[ii];
        return answer;

    }
    public static String reverStringLambda(String str){
        return Arrays.stream(str.split(" "))
                .map(word->new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(" "));
    }
}
