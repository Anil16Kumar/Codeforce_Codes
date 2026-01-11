package Sorting;

import java.util.Scanner;

public class HeapSorting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t=scanner.nextInt();

        while(t--!=0){
            int n=scanner.nextInt();

            int[] A=new int[n];

            for(int i=0;i<n;i++)
                A[i]=scanner.nextInt();

            heapSortingFunction(A);

            for(int i=0;i<n;i++)
                System.out.print(A[i]+" ");
        }

    }

    private static void heapSortingFunction(int[] a) {
        int n=a.length;

        for(int i=n/2 - 1; i>=0; i--){
            heapifyFunction(a,n,i);
        }

        for(int i=n-1;i>0;i--){
            int temp=a[0];
            a[0]=a[i];
            a[i]=temp;
            heapifyFunction(a,i,0);
        }

    }

    private static void heapifyFunction(int[] a, int n, int i) {

        int largest = i;
        int left=2*i + 1;
        int right=2*i + 2;

        if(left<n && a[left]>a[largest]) largest = left;
        if(right<n && a[right]>a[largest]) largest = right;

        if(largest!=i){
            int temp=a[i];
            a[i]=a[largest];
            a[largest]=temp;

            heapifyFunction(a,n,largest);
        }

    }

}
