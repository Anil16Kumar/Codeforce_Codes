package Recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class findExp_Expression_Add_Operators_imp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int target=scanner.nextInt();

        ArrayList<String> answer = new ArrayList<>();
        findAllExpressions(str, 1, "" + str.charAt(0), answer,target);
        Collections.sort(answer);
        System.out.println(answer);
//        System.out.println(answer.size());
    }

    private static void findAllExpressions(String str, int idx, String expr,
                                           ArrayList<String> answer,int target) {

        if (idx == str.length()) {
            if(solveExpresion(expr)==target)
                answer.add(expr);
            return;
        }

        char curr = str.charAt(idx);

        findAllExpressions(str, idx + 1, expr + "+" + curr, answer,target);

        findAllExpressions(str, idx + 1, expr + "-" + curr, answer,target);

        findAllExpressions(str, idx + 1, expr + "*" + curr, answer,target);

        findAllExpressions(str, idx + 1, expr + curr, answer,target);
    }

    private static int solveExpresion(String exp) {

        int curr = 0;
        int last = 0;
        int result = 0;
        char op = '+';

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            if (Character.isDigit(ch)) {
                curr = curr * 10 + (ch - '0');
            }

            if (!Character.isDigit(ch) || i == exp.length() - 1) {

                if (op == '+') {
                    result += last;
                    last = curr;
                }
                else if (op == '-') {
                    result += last;
                    last = -curr;
                }
                else if (op == '*') {
                    last = last * curr;
                }

                op = ch;
                curr = 0;
            }
        }

        result += last;

        return result;
    }

}
