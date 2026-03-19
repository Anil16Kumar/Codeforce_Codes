package cf;

import java.util.Scanner;

public class Pair {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int A[]=new int[n];
        for(int i=0;i<n;i++)
            A[i]=scanner.nextInt();

        int m=scanner.nextInt();
        int B[]=new int[m];
        for (int i=0;i<m;i++)
            B[i]=scanner.nextInt();

        int count=0;
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
                if(B[j]!=-1 && Math.abs(A[i]-B[j])<=1){
                    count++;
                    B[j]=-1;
                    break;
                }
        System.out.println(count);


    }
}
