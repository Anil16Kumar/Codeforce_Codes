package CC.Collection;

import java.util.*;

public class Prac4_im {
    public static void main(String[] args) {

        List<Integer> lst8=Arrays.asList(1,1,1,2,2,2,2,2,3);
        Map<Integer,Integer> topFreq=new TreeMap<>();
        for(int val:lst8)
            topFreq.put(val,topFreq.getOrDefault(val,0)+1);
        List<Map.Entry<Integer,Integer>> lst10=new ArrayList<>(topFreq.entrySet());
        lst10.sort((a,b)->b.getValue()-a.getValue());
        System.out.println(lst10);
        System.out.println("top frequency: "+lst10.get(0).getKey());



        Map<Character,Integer> mp2=new TreeMap<>();
        mp2.put('a',3);
        mp2.put('b',1);
        mp2.put('c',2);
        List<Map.Entry<Character,Integer>> lst9=new ArrayList<>(mp2.entrySet());
        lst9.sort((a,b)->a.getValue()-b.getValue());
        System.out.println(lst9);


        List<Integer> lst7=Arrays.asList(1,2,3,2,4,5,1);
        Map<Integer,Integer> numCo=new TreeMap<>();
        for(int num:lst7){
            numCo.put(num,numCo.getOrDefault(num,0)+1);
        }
        List<Integer> answer=new ArrayList<>();
        for(Map.Entry<Integer, Integer> num:numCo.entrySet()){
            if(num.getValue()>1)
                answer.add(num.getKey());
        }
        System.out.println(answer);




        List<String> lst6=Arrays.asList("hi","hello","bye","ok");
        Map<Integer,List<String>> numStr=new TreeMap<>();
        for(String val:lst6){
            int sze=val.length();
            List<String> lst=numStr.getOrDefault(sze,new ArrayList<>());
            lst.add(val);
            numStr.put(sze,lst);
        }
        System.out.println(numStr);


        List<String> lst5=Arrays.asList("apple","ant","banana","boy");
        Map<Character,List<String>> AlphGrp=new TreeMap<>();
        for(String str:lst5){
            char ch=str.charAt(0);
            List<String> lst=AlphGrp.getOrDefault(ch,new ArrayList<>());
            lst.add(str);
            AlphGrp.put(ch,lst);
        }
        System.out.println(AlphGrp);


        List<Integer> lst4=Arrays.asList(1,2,1,3,2,3,232,12,5,121,3);
        Collections.sort(lst4);
        System.out.println(lst4);
        lst4.sort(Collections.reverseOrder());
        System.out.println(lst4);


        String word="aabbccddeff";
        Map<Character,Integer> countf=new LinkedHashMap<>();
        for(char ch:word.toCharArray()){
            countf.put(ch,countf.getOrDefault(ch,0)+1);
        }
        char ans=' ';
        for(char ch:word.toCharArray())
            if(countf.get(ch)==1){
                ans=ch;
                break;
            }
        System.out.println(ans==' '?"no dublicate char inside the string":"dublicate char is:"+ans);



        List<Integer> lst3=Arrays.asList(1,2,2,3,4,4,5);
        Set<Integer> st=new TreeSet<>(lst3);
        System.out.println(st);


        List<String> lst2=Arrays.asList("apple","banana","apple","orange","banana","apple");
        Map<String, Integer> count=new TreeMap<>();
        for(String val:lst2){
            count.put(val,count.getOrDefault(val,0)+1);
        }
        System.out.println(count);
//------------

        String str="this is all about the computer science and its application";
        Map<Character,List<String>> grp=new HashMap<>();
        for(String val:str.split(" ")){
            char ch=val.charAt(0);
            List<String> lst=grp.getOrDefault(ch,new ArrayList<>());
            lst.add(val);
            grp.put(ch,lst);
        }
        System.out.println(grp);



        List<String> lst1=Arrays.asList("apple","ant","banana","boy","computer","dog","elephant");
        Map<Character,List<String>> group=new HashMap<>();
        for(String val:lst1){
            char ch=val.charAt(0);
            List<String> lst=group.getOrDefault(ch,new ArrayList<>());
            lst.add(val);
            group.put(ch,lst);
        }
        System.out.println(group);

        List<String> lst= Arrays.asList("apple","mango","apple","mango","computer","mouse");
        Map<String,Integer> mp=new LinkedHashMap<>();
        for(String val: lst)
            mp.put(val,mp.getOrDefault(val,0)+1);
        System.out.println(mp);
    }
}
