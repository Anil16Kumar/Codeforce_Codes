package CC.Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class set_3 {
    public static void main(String[] args) {

        //---------------SET---------------------
        // Set is a collection that cannot contain duplicate elements
        //Faster operation
        //ye hashmap ke principle pe based h, so find karne ki time complexity aur insert karne ki time complexity O(1)

        // Map --> HashMap, LinkedHashMap, TreeMap, EnumMap similary set bhi hota h:-
        // Set --> HashSet, LinkedHashSet, TreeSet, EnumSet

        Set<Integer> s1=new HashSet<>();
        s1.add(12);
        s1.add(34);
        s1.add(12);
        System.out.println(s1); // unique value hi aaega par order maintain nahi hoga

        Set<Integer> s2=new LinkedHashSet<>();
        s2.add(12);
        s2.add(34);
        s2.add(12);
        System.out.println(s2); // unique bhi hoga aur order bhi maintain rahega...

        Set<Integer> s3=new TreeSet<>();
        s3.add(32);
        s3.add(54);
        s3.add(1);
        s3.add(55);
        System.out.println(s3); // unique bhi hoga aur sorted bhi


    }
}
