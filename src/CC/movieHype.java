package CC;

import java.util.Scanner;

public class movieHype {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();

        while(t--!=0){
            int n=scanner.nextInt();
            int[] seat=new int[n+1];
            for(int i=0;i<n+1;i++)
                seat[i]=scanner.nextInt();

            int answer=Integer.MAX_VALUE;
            for(int i=1;i<n+1;i++){
                int loud=Math.max(seat[i],seat[i-1]);
                answer=Math.min(loud,answer);
            }
            System.out.println(answer);
        }
    }
}
