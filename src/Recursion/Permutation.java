package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class Permutation {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();

        int n= scanner.nextInt();
        int[] A=new int[n];

        for(int i=0;i<n;i++)
            A[i]=scanner.nextInt();

        ArrayList<ArrayList<Integer>> answer=allPermutationPrint(A);

        System.out.println(answer);
    }

    private static ArrayList<ArrayList<Integer>> allPermutationPrint(int[] a) {

        ArrayList<ArrayList<Integer>> answer=new ArrayList<>();
        ArrayList<Integer> temp=new ArrayList<>();

        allPermutationPrintHelp(a,0,a.length-1,answer);
        return answer;

    }

    private static void allPermutationPrintHelp(int[] a, int l, int r, ArrayList<ArrayList<Integer>> answer) {

        if(l==r){
            ArrayList<Integer> curr=new ArrayList<>();
            for(int i=0;i<a.length;i++)
                curr.add(a[i]);
            answer.add(curr);
            return;
        }

        for(int i=l;i<=r;i++){
            swap(a,l,i);
            allPermutationPrintHelp(a,l+1,r,answer);
            swap(a,l,i);
        }
        return;
    }
    private static void swap(int[] a, int idx1,int idx2){
        int temp=a[idx1];
        a[idx1]=a[idx2];
        a[idx2]=temp;
        return;
    }
}
