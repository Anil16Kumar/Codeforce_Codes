package lambdaExp;

import java.sql.Struct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.*;

class Student{
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

public class allFunctioninterface {
    public static void main(String[] args) {
        Predicate<Integer> integerPredicate=(x) -> x%2==0;
        System.out.println(integerPredicate.test(12));

        Predicate<String> startWith=str->str.toLowerCase().charAt(0)=='a';
        Predicate<String> endsWith=str->str.toLowerCase().charAt(str.length()-1)=='l';

        Predicate<String> compare=startWith.and(endsWith);
        System.out.println(compare.test("anil"));
        System.out.println(compare.test("animal"));
        System.out.println(compare.test("ansdss"));

//        String str="asdadasd";
//        System.out.println();

//        Predicate<String> inOne=str->str.toLowerCase().charAt(0)=='a';
        Student student=new Student(1,"Anil Kumar");
        Predicate<Student> studentPredicate=s1->s1.getId()>=1;
        if(studentPredicate.test(student))
            System.out.println(student);
        System.out.println(studentPredicate.test(student));

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14);
        for(int val:list){
            if(integerPredicate.test(val)){
                System.out.println(val);
            }
        }
        int cal=Integer.MIN_VALUE;
        List<Integer> lst=new ArrayList<>();

        Function<String,Integer> strLenFunc=str->str.length();
        System.out.println("String length: "+strLenFunc.apply("anilkumarsingh0160"));

        Function<String,String> funcForsubstr=str->str.substring(3,8);
        System.out.println("string: 'abcdefghojklmnopqrst': "+ funcForsubstr.apply("abcdefghojklmnopqrst"));

        Student s1=new Student(11,"Anil Kumar");
        Student s2=new Student(12,"Anurag Singh");
        Student s3=new Student(13,"Aniket Singh");
        Student s4=new Student(14,"Anil Kumar singh");
        Student s5=new Student(15,"Anil Yadav");
        List<Student> studentList=Arrays.asList(s1,s2,s3,s4,s5);

        Function<List<Student>,List<Student>> lstStu=li->{
          for(Student st:li){
              st.setName("Mr. "+st.getName());
          }
          return li;
        };
        System.out.println(lstStu.apply(studentList));

        Function<List<Student>,List<Integer>> getUserId=slist->{
          List<Integer> answer=new ArrayList<>();
          for(Student stud:slist){
              if(stud.getName().substring(4, 8).equalsIgnoreCase("anil"))
                  answer.add(stud.getId());
          }
          return answer;
        };
        System.out.println(getUserId.apply(studentList));

        Function<String,String> strfun1=str->str.toUpperCase();
        Function<String,String> strfun2=str->str.substring(0,4);
        Function<String,String> funChain=strfun1.andThen(strfun2);

        System.out.println(funChain.apply("anilkumarsingh"));
        System.out.println(strfun1.andThen(strfun2).apply("anuragsingh0"));

        Function<Integer,Integer> multiplyBy2=num->num*2;
        Function<Integer,Integer> cude=num->num*num*num;
        System.out.println(multiplyBy2.andThen(cude).apply(1));
        System.out.println(cude.andThen(multiplyBy2).apply(1));

        Function<String,String> indentityFunction=Function.identity();
        System.out.println(indentityFunction.apply("anilkumarsinghyadav"));

        Consumer<List<Integer>> consume=lt->{
            for(Integer val:lt)
                System.out.println(val+100);
        };
        consume.accept(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        Consumer<List<Integer>> clist1=l1->{
            for(Integer val:l1)
                System.out.println(val);
        };

        System.out.println("-------------");
        Consumer<List<Integer>> clist2=l2->{
            for(Integer val:l2)
                System.out.println(val+100);
        };


        BiFunction<Integer,Integer,Integer> biFunction = (x,y) -> {
            return 7-(x+y);
        };



        clist2.andThen(clist1).accept(Arrays.asList(11,22,33,44,55,66));

        System.out.println("---------");

        Supplier<Integer> sup=()->100;
        System.out.println(sup.get());

        UnaryOperator<String> uSubStr=str->str.substring(1,5);
        System.out.println(uSubStr.apply("abcdefghijklmnopqrstuvwxyz"));


    }
}
