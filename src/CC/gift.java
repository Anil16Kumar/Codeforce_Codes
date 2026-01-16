package CC;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.function.*;
import java.util.stream.*;
class gift
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner scanner=new Scanner(System.in);

        Function<int[],String> func=Arr->Arr[0]+Arr[2]>=Arr[1]?"YES":"NO";

        Consumer<Scanner> perfromTestCases=sc->{
            System.out.println(func.apply(new int[]{sc.nextInt(),sc.nextInt(),sc.nextInt()}));
        };

        IntStream.range(0,scanner.nextInt()).forEach(i->perfromTestCases.accept(scanner));
    }
}

