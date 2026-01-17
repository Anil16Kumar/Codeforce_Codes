package DataStrutureAndAlgorithm.Treeds;

import java.util.Scanner;

public class TreeMain {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        Tree tree=new Tree();

        for(int i=0;i<n;i++){
            tree.insertData(scanner.nextInt());
        }
        tree.inorderTraversal();
    }
}
