package cf;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.function.BiPredicate;

public class helpfulMath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s=scanner.next();

        char[] arr = s.replace("+", "").toCharArray();

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            while (left < right && arr[left] == '1') left++;

            while (left < right && arr[right] == '3') right--;

            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }

        String answer="";
        answer+=arr[0];

        for(int i=1;i< arr.length;i++){
            answer+="+"+arr[i];
        }

        System.out.println(answer);
        BiPredicate<Integer,Integer> biPre=(num1, num2)->{
            if(num1>=num2)
                return true;
            else
                return false;
        };
//        IntStr
//        int c1=0,c2=0,c3=0;
//
//        for(int i=0;i<str.length();i++){
//            if(str.charAt(i)=='1')
//                c1++;
//            else if(str.charAt(i)=='2')
//                c2++;
//            else if(str.charAt(i)=='3')
//                c3++;
//        }
//        String answer="";
//        while(c1-->0) answer+="1+";
//        while(c2-->0) answer+="2+";
//        while(c3-->0) answer+="3+";
//
//        answer=answer.substring(0,answer.length()-1);
//        System.out.println(answer);

    }
}
