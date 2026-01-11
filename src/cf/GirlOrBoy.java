package cf;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GirlOrBoy {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String str=scanner.next();

        List<Character> lst=new ArrayList<>();
        lst.add(str.charAt(0));
        for(int i=1;i<str.length();i++)
            if(!lst.contains(str.charAt(i)))
                lst.add(str.charAt(i));

        System.out.println(lst.size()%2==0?"CHAT WITH HER!":"IGNORE HIM!");

    }
}
