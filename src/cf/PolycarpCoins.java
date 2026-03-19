package cf;

import java.util.Scanner;

public class PolycarpCoins {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while(t-->0){
            int n=scanner.nextInt(),k=scanner.nextInt();
            String str=scanner.next();
            int Freq[]=new int[26];

            for(int i=0;i<n;i++){
                Freq[str.charAt(i)-'a']++;
            }

            

        }
    }
}
