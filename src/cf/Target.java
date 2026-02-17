package cf;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.IntStream;

public class Target {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        Function<String[], Integer> function=Arr->{
            Integer temp=0;
            for(int i=0;i<10;i++){
                for(int j=0;j<10;j++){
                    if(Arr[i].charAt(j)=='X') {
                        if ((i == 0 || j == 0 || i == 9 || j == 9) && Arr[i].charAt(j) == 'X')
                            temp += 1;//System.out.print(1+" ");
                        else if ((i == 1 || j == 1 || i == 8 || j == 8) && Arr[i].charAt(j) == 'X')
                            temp += 2;//System.out.print(2+" ");
                        else if ((i == 2 || j == 2 || i == 7 || j == 7) && Arr[i].charAt(j) == 'X')
                            temp += 3;//System.out.print(3+" ");
                        else if ((i == 3 || j == 3 || i == 6 || j == 6) && Arr[i].charAt(j) == 'X')
                            temp += 4;//System.out.print(4+" ");
                        else if ((i == 4 || j == 4 || i == 5 || j == 5) && Arr[i].charAt(j) == 'X')
                            temp += 5;//System.out.print(5+" ");
                    }

                }
//                System.out.println();
            }
            return temp;
        };
        Consumer<Scanner> perfromTestCases=sc->{
          String Arr[]=new String[10];
          for(int i=0;i<10;i++)
              Arr[i]=sc.next();

            System.out.println(function.apply(Arr));
        };
        IntStream.range(0,scanner.nextInt()).forEach(i->perfromTestCases.accept(scanner));



    }
}
