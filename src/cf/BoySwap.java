package cf;

import java.util.Arrays;
import java.util.Scanner;

public class BoySwap {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int t=scanner.nextInt();
        String que=scanner.next();
        char[] strArr=que.toCharArray();

        if(que.length()!=1) {
            while (t-- != 0) {
                int[] present=new int[n];
                Arrays.fill(present, 0);
                for(int i=1;i<strArr.length;i++)
                    if(present[i]!=1 && present[i-1]!=1  && strArr[i-1]=='B' && strArr[i]=='G'){
                        char temp=strArr[i-1];
                        strArr[i-1]=strArr[i];
                        strArr[i]=temp;
                        present[i-1]=1;
                        present[i]=1;
                    }

            }
        }
        String answer= String.valueOf(strArr);
        System.out.println(answer);

    }
}
