package cf;

import java.util.Scanner;

public class spellCheck {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while (t-->0){
            int n=scanner.nextInt();
            String inp=scanner.next();
            String smp="Timur";
            int sum=0;
            for(int i=0;i<smp.length();i++)
                sum+=smp.charAt(i);

            if(n!=5)
                System.out.println("NO");
            else{
                for(int i=0;i<inp.length();i++)
                    sum-=inp.charAt(i);

                if(sum==0)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }

        }
    }
}
