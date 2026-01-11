package Sorting;

import java.util.Scanner;

public class quickSort {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while(t--!=0){
            int n=scanner.nextInt();

            int[] A=new int[n];

            for(int i=0;i<n;i++)
                A[i]=scanner.nextInt();

            quickSortFunction(A,0,n-1);

            for(int ele:A)
                System.out.print(ele+" ");
        }

    }

    private static void quickSortFunction(int[] a, int low, int high) {
        if(low<high){
            int pivot=partitionMethod(a,low,high);

            quickSortFunction(a,low,pivot-1);
            quickSortFunction(a,pivot+1,high);
        }
    }

    private static int partitionMethod(int[] a, int low, int high) {

        int pivote=a[high];
        int i=low-1;

        for(int j=low;j<high;j++){
            if(a[j]<pivote){
                i++;
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
        int temp=a[i+1];
        a[i+1]=a[high];
        a[high]=temp;
        return i+1;
    }

}
