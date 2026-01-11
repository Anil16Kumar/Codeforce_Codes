package Recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RecamansSeq {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();

        ArrayList<Integer> answer=recamanSequence(n);
        for(int val:answer)
            System.out.println(val);
    }

    private static ArrayList<Integer> recamanSequence(int n) {
        ArrayList<Integer> answer=new ArrayList<>();

        int[] A=new int[n];
        A[0]=0;
        for(int i=1;i<n;i++){
            if(A[i-1]-i <= 0)
                A[i]=A[i-1]+i;
            else
                A[i]=A[i-1]-i;
        }

        for(int i:A)
            answer.add(i);

        return answer;

    }

    private static int recamanSequenceHelp(int n) {
        if(n==0)
            return 0;

        int val = recamanSequenceHelp(n-1)-n;
        if(val < 0)
        {
            val=recamanSequenceHelp(n-1)+n;
            System.out.println(val);
        }
        else
            System.out.println(val);

        return 0;
    }
}
