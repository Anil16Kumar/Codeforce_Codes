package Strings;

public class s1 {
    public static void main(String[] args) {
        String str="abcdefghi";
        str+=str.substring(3);

        System.out.println(str);
        str = String.valueOf(str.substring(3));
        System.out.println(str);
    }
}
