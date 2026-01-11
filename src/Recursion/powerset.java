package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class powerset {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.next();
        System.out.println(printAllSubSet(str));
    }

    private static ArrayList<String> printAllSubSet(String str) {
        ArrayList<String> answer=new ArrayList<>();
        String temp="";
        int curr=0;
        printAllSubSetHelp(answer,temp,curr,str);
        return answer;
    }

    private static void printAllSubSetHelp(ArrayList<String> answer, String temp, int curr, String str) {

        if(curr==str.length()){
            answer.add(temp);
            return;
        }
        printAllSubSetHelp(answer,temp,curr+1,str);
        char ch=str.charAt(curr);
        temp+=ch;
        printAllSubSetHelp(answer,temp,curr+1,str);

    }
}
