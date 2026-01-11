package cf;

import java.util.Scanner;

public class nextRound {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int k=scanner.nextInt();
        int n=scanner.nextInt();
        int count=0;
        int[] A=new int[k];
        for(int i=0;i<k;i++)
            A[i]=scanner.nextInt();

        for(int i = 0; i<k; i++)
            if(A[i]>0 && A[i]>=A[n-1])
                count++;

        System.out.println(count);
    }
}
