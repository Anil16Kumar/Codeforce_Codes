import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        System.out.println("Hello and welcome!");



        Scanner Sc=new Scanner(System.in);

        int a=Sc.nextInt();

        if(a<10)
        {
            System.out.println(a+"  is smaller than 10");
        }
        else if(a<20 && a>10)//and
        {
            System.out.println(a+" is bigger then 10 but smaller then 20");
        }
        else if(a<30 && a>20)
        {
            System.out.println(a+" is greater than 20 but smaller then 30");
        }
        else
        {
            System.out.println(a+" greater than 30");
        }



    }
}