package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Rseriecs {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();

        System.out.println(rSerise(n));
    }

    private static ArrayList<Integer> rSerise(int n) {

        ArrayList<Integer> answer=new ArrayList<>();
        hSeriseHelp(n-1,answer);
        return answer;

    }

    private static int hSeriseHelp(int n,ArrayList<Integer> answer) {

        if(n==0){
            answer.add(0);
            return 0;
        }

        int val=hSeriseHelp(n-1,answer);
        if(val-n>0 && !answer.contains(val-n)){
            answer.add(val-n);
            return val-n;
        }

        else{
             answer.add(val + n);
            return val + n;
        }
    }
}
