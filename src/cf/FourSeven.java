package cf;

import java.util.Scanner;

public class FourSeven {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();

//        System.out.println(checkFourSeven(num));

        if(checkFourSeven(num) || isDevisible(num))
            System.out.println("YES");
        else
            System.out.println("NO");
    }

    public static boolean checkFourSeven(int num){
        int four=0;
        int seven=0;
        int count=0;
        while(num!=0){
            int temp=num%10;
            if(temp==4)
                four++;
            else if(temp==7)
                seven++;
            num/=10;
            count++;
        }
        return (four+seven)==count;
    }
    public static boolean isDevisible(int num){
        return num%4==0||num%7==0||num%47==0||num%74==0||num%77==0||num%44==0;
    }
}
