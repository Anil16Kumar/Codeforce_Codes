package cf;

import java.util.Scanner;

public class powerof5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int best=Integer.MIN_VALUE, worst=Integer.MAX_VALUE;
        int val=scanner.nextInt();
        best=val;
        worst=val;
        int count=0;
        for(int i=0;i<n-1;i++){
            val=scanner.nextInt();
            if(val>best){
                best=val;
                count++;
            }
            else if(val<worst){
                worst=val;
                count++;
            }
        }
        System.out.println(count);

    }
}
