package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class stringCharPresent {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        String answer="No";
        while(t--!=0){
            answer="No";
            int len=scanner.nextInt();
            String str=scanner.next();
            int[] present=new int[26];
            Arrays.fill(present, 0);

            for(int i=0;i<len;i++){
                if(present[str.charAt(i) - 'a']==1){
                    answer="Yes";
                    break;
                }
                present[str.charAt(i)-'a']=1;
            }
            System.out.println(answer);
        }

    }
}
