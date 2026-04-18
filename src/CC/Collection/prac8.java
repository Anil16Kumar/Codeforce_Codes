package CC.Collection;

import java.util.*;

class Students{
    Integer id;
    String name;
    Integer marks;

    public Students(Integer id, String name, Integer marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}
public class prac8 {
    public static void main(String[] args) {
        Map<Integer, Students> mp=new HashMap<>();
        mp.put(1,new Students(12,"wqert",90));
        mp.put(2,new Students(34,"urtu",91));
        mp.put(3,new Students(23,"qwrqt",59));
        mp.put(4,new Students(2,"xytw",50));
        mp.put(323,new Students(2,"xytwrqwrq",50));
        mp.put(41,new Students(2,"x",50));


        for (Map.Entry<Integer,Students> val:mp.entrySet())
            System.out.println(val.getKey()+" ");
        List<Map.Entry<Integer,Students>> lst=new ArrayList<>(mp.entrySet());

        Collections.sort(lst,(a,b)->a.getValue().getName().length()-b.getValue().getName().length());
        //lst.sort();
        //Collections.sort(mp);
        System.out.println(lst);

    }
}
