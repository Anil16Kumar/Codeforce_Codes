package CC.Collection;

import java.util.*;

public class Prac5 {
    public static void main(String[] args) {



        List<Integer> numlist= Arrays.asList(1,2,1,2,1,3,2,3,4,3,4,55,6,6,77,77,77,77,87,9);
        Map<Integer,Integer> mpFreq=new HashMap<>();
        for(int val:numlist)
            mpFreq.put(val, mpFreq.getOrDefault(val,0)+1);
        List<Map.Entry<Integer,Integer>> numFreq=new ArrayList<>(mpFreq.entrySet());
//        for(Map.Entry<Integer,Integer> mp:numFreq){
//            System.out.println(mp.getKey()+" - "+mp.getValue());
//        }
        numFreq.sort((a,b)->b.getValue()-a.getValue());
        Collections.sort(numFreq,(a,b)->b.getValue()-a.getValue());
        System.out.println("--");
        for(Map.Entry<Integer,Integer> mp:numFreq){
            System.out.println(mp.getKey()+" - "+mp.getValue());
        }
        System.out.println("top 2 frequency element: "+numFreq.get(0).getKey()+" ,and "+numFreq.get(1).getKey());


        String[] sentance={"hello world","my name is","hello java","name anil","my place is"};
        Map<String, List<Integer>> wordPos=new HashMap<>();
        for(int i=0;i<sentance.length;i++){
            String[] words=sentance[i].split(" ");
            for(String word:words) {
                List<Integer> numLst = wordPos.getOrDefault(word, new ArrayList<>());
                numLst.add(i + 1);
                wordPos.put(word, numLst);
            }
        }
        System.out.println(wordPos);
    }
}
