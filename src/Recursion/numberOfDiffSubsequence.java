package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class numberOfDiffSubsequence {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String str=scanner.next();
        ArrayList<String> answer=printAllSubsequences(str);

        System.out.println(answer);
    }

    public static ArrayList<String> printAllSubsequences(String str){
        ArrayList<String> answer=new ArrayList<>();
        String temp=new String();
        int count=0;
        printAllSubsequencesHelp(str,0,count,answer);
        return answer;
    }

    private static void printAllSubsequencesHelp(String str, int i,int temp,ArrayList<String> answer) {

        if(i==str.length()){
            
            return;
        }

        temp+=str.charAt(i);
        printAllSubsequencesHelp(str,i+1,temp,answer);

        //temp=temp.substring(0,temp.length()-1);
        printAllSubsequencesHelp(str,i+1,temp,answer);
        return;

    }
}
