package cf;

import java.util.Arrays;
import java.util.Scanner;

public class AntonLetter {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();

        int[] Arr = new int[26];
        Arrays.fill(Arr, 0);
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!='{' && str.charAt(i)!='}' && str.charAt(i)!=',' && str.charAt(i)!=' ')
                if(Arr[str.charAt(i)-'a']==0){
                    Arr[str.charAt(i)-'a']++;
                    count++;
                }
        }
        System.out.println(count);

    }
}
