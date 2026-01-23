package cf;

import java.util.Scanner;

public class evenness {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int evencount=0,oddcount=0,even=0,odd=0;
        for(int i=0;i<n;i++){
            int num=scanner.nextInt();
            if(num%2==0){
                even=i+1;
                evencount++;
            }
            else{
                odd=i+1;
                oddcount++;
            }
        }

        if(oddcount==1)
            System.out.println(odd);
        else
            System.out.println(even);
    }
}
