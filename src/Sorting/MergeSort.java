package Sorting;

import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();

        int[] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=scanner.nextInt();

        mergeSortFunction(a,0,n-1);

        for(int val:a)
            System.out.print(val+" ");
    }

    private static void mergeSortFunction(int[] a, int left, int right) {
        if(left<right){
            int mid=left+(right-left)/2;

            mergeSortFunction(a,left,mid);
            mergeSortFunction(a,mid+1,right);
            merging(a,left,mid,right);
        }
    }

    private static void merging(int[] a, int left, int mid, int right) {
        int n1=mid-left+1;
        int n2=right-mid;

        int[] L=new int[n1];
        int[] R=new int[n2];

        for(int i=0;i<n1;i++) L[i]=a[left+i];
        for(int j=0;j<n2;j++) R[j]=a[mid+1+j];

        int i=0,j=0,k=left;

        while(i<n1 && j<n2){
            if(L[i]<=R[j]) a[k++]=L[i++];
            else a[k++]=R[j++];
        }

        while(i<n1) a[k++]=L[i++];
        while(j<n2) a[k++]=R[j++];
    }
}
