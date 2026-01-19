package CC;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Discount {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Integer> lst=new ArrayList<>();
        int t=scanner.nextInt();
        for(int i=0;i<t;i++)
            lst.add(scanner.nextInt());

        List<Integer> answer=lst.stream().map(val->100-val).collect(Collectors.toList());
        System.out.println(answer);
    }
}
