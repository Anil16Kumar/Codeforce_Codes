package DataStrutureAndAlgorithm.Treeds;

public class Tree {
    Node root=null;

    public void insertData(int data){
        root=insertDataHelper(root, data);
    }
    private Node insertDataHelper(Node root, int data){
        if(root==null){
            root=new Node(data);
        }
        else if(root.data>data)
            root.left=insertDataHelper(root.left,data);
        else
            root.right=insertDataHelper(root.right,data);
        return root;
    }

    public void inorderTraversal(){
        inorderTraversalHelper(root);
    }
    private void inorderTraversalHelper(Node root){
        if(root==null)
            return;

        inorderTraversalHelper(root.left);
        System.out.println(root.data);
        inorderTraversalHelper(root.right);
    }



}
