package cf;

import java.util.Scanner;

public class NightMuseum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

            String str=scanner.next();


            int sum=0;
            char currentChar='a';
            for(int i=0;i<str.length();i++){
                int diff=Math.abs(currentChar-str.charAt(i));
                if(diff>13){
                    sum+=(26-diff);
                }
                else{
                    sum+=diff;
                }
                currentChar=str.charAt(i);
            }
            System.out.println(sum);
        }
}
