package cf;

import java.util.Arrays;
import java.util.Scanner;

public class equalTreaser {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int max=Integer.MIN_VALUE;
        int[] Arr=new int[n];
        for(int i=0;i<n;i++){
            Arr[i]=scanner.nextInt();
            if(Arr[i]>max)
                max=Arr[i];
        }
        int finalMax = max;
        int answerSum= Arrays.stream(Arr).map(val-> finalMax -val).sum();
        System.out.println(answerSum);
    }
}
