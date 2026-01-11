package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class printAllSubsequencesTarget {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();

        int[] A=new int[n];
        for(int i=0;i<n;i++)
            A[i]=scanner.nextInt();

        int target=scanner.nextInt();
        ArrayList<ArrayList<Integer>> allList=printAllList(A,target);
        System.out.println(allList);
    }

    private static ArrayList<ArrayList<Integer>> printAllList(int[] a, int target) {

        ArrayList<ArrayList<Integer>> answer=new ArrayList<>();
        ArrayList<Integer> temp=new ArrayList<>();
        Arrays.sort(a);
        printAllListHelp(a,0,temp,answer,target);
        return answer;

    }

    private static void printAllListHelp(int[] a,int idx, ArrayList<Integer> temp,
                                         ArrayList<ArrayList<Integer>> answer,int target) {

        if(target==0){
            if(!answer.contains(temp))
                answer.add(new ArrayList<>(temp));
            return;
        }

        if(target<0 || idx>=a.length)
            return;

        printAllListHelp(a,idx+1,temp,answer,target);

        if(a[idx]<=target){
            temp.add(a[idx]);
            printAllListHelp(a,idx+1,temp,answer,target-a[idx]);
            temp.remove(temp.size()-1);
        }
        return;
    }
}
