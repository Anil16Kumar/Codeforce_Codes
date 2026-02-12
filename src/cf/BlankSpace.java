package cf;

import java.util.Scanner;

public class BlankSpace {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while(t--!=0){
            int n=scanner.nextInt();
            int space=0;
            int count=0;
            int answer=Integer.MIN_VALUE;
            while(n--!=0){
                int num=scanner.nextInt();
                if(num==0)
                    count++;
                else if(num==1)
                    count=0;
                answer=Math.max(count,answer);
            }
            System.out.println(answer);
        }
    }
}
