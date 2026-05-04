package CC.Collection;

import java.util.*;

public class Prac6 {
    public static void main(String[] args) {



        String str="these are the exceptions that are checked at COMPILE time. If some code within a method throws a checked exception, then the method must either handle the exception or it must specify the exception using the throws keyword.\n" +
                "Example: SQLException, IOException, Interrupted Exception";
        String words[]=str.split(" ");
        Map<String,Integer> mp=new TreeMap<>();
        for(String word:words){
            mp.put(word,mp.getOrDefault(word,0)+1);
        }
        List<Map.Entry<String,Integer>> lst=new ArrayList<>(mp.entrySet());
        lst.sort((a,b)->b.getValue()-a.getValue());
        System.out.println(lst);
    }
}
