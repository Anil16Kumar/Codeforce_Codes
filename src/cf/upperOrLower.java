package cf;

import java.util.Scanner;

public class upperOrLower {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.next();
        int low=0;
        int high=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='a' && str.charAt(i)<='z')
                low++;
            else
                high++;
        }
        System.out.println(low==high?str.toLowerCase():low<high?str.toUpperCase():str.toLowerCase());

    }
}
