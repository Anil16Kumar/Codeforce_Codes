package DataStrutureAndAlgorithm.BST;

public class BinaryTree {

    Node root;

    public void insertData(int data){
        root=insertDataHelp(data,root);
    }
    private Node insertDataHelp(int data,Node root){
        if(root==null)
            return new Node(data);
        if(root.data>data)
            root.left=insertDataHelp(data,root.left);
        else
            root.right=insertDataHelp(data,root.right);
        return root;
    }

    public void traversalTree(){
        traversalTreeHelp(root);
    }
    private void traversalTreeHelp(Node root){
        if(root==null)
            return;
        traversalTreeHelp(root.left);
        System.out.println(root.data);
        traversalTreeHelp(root.right);
    }

    public void deleteTreeNode(int data){
        root=deleteTreeNodeHelp(root,data);
    }
    private Node deleteTreeNodeHelp(Node root,int data){
        if(root==null)
            return null;
        if(root.data>data)
            root.left=deleteTreeNodeHelp(root.left,data);
        else if(root.data<data)
            root.right=deleteTreeNodeHelp(root.right,data);
        else{
            if(root.left==null && root.right==null)
                return null;
            if(root.left==null)
                return root.right;
            if(root.right==null)
                return root.left;

            Node successer=findMinimum(root.right);
            root.data=successer.data;
            root.right=deleteTreeNodeHelp(root.right,successer.data);
        }
        return root;
    }
    private Node findMinimum(Node root){
        while(root.left!=null)
            root=root.left;
        return root;
    }

}
