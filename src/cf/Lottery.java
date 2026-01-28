package cf;

import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        int count=0;
        while(num!=0){
            if(num>=100){
                count+=(num/100);
                num-=(100*(num/100));
            }
            else if(num>=20){
                count+=(num/20);
                num-=(20*(num/20));
            }
            else if(num>=10){
                count+=(num/10);
                num-=(10*(num/10));
            }
            else if(num>=5){
                count+=(num/5);
                num-=(5*(num/5));
            }
            else{
                count+=(num);
                num-=((num));
            }
        }
        System.out.println(count);

    }
}
