package DataStrutureAndAlgorithm.BST;

public class TreeUse {
    public static void main(String[] args) {
        BinaryTree binaryTree=new BinaryTree();
        binaryTree.insertData(12);
        binaryTree.insertData(32);
        binaryTree.insertData(443);
        binaryTree.insertData(2);

        binaryTree.traversalTree();
        binaryTree.deleteTreeNode(443);
        System.out.println();
        binaryTree.traversalTree();

    }
}
