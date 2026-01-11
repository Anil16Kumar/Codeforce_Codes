package StringPrac;

public class StringClass {
    public static void main(String[] args) {
        String str="abcdef";

        str+='z';
        System.out.println(str);
        str=str.substring(0,str.length()-1);

        System.out.println(str);
    }
}
