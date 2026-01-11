package Strings;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class strams {
    public static void main(String[] args) {
        List<String> lst= Arrays.asList("java","core java","java ee","java me","python");

        lst.forEach(System.out::println);

        lst.forEach(b->{
            try {
                System.out.println(b);
                if(b=="python")
                    throw new RuntimeException("python is not allowed..");
            }catch (Exception e){
                e.printStackTrace();
            }
        });

    }
}
