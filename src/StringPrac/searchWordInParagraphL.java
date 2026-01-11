package StringPrac;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.BiFunction;

public class searchWordInParagraphL {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String paragraph=scanner.nextLine();
        String word=scanner.next();

        BiFunction<String,String, Boolean> findWord=(par, wrd)->{
            return Arrays.stream(par.split(" ")).anyMatch(words->words.equalsIgnoreCase(wrd));
        };

        System.out.println(findWord.apply(paragraph,word)?"Yes word is present in the paragraph":
                                                    "NO, word is not present inside the paragraph..");

    }
}
