package DSAExamples;

import java.util.*;
public class BTinOrderTraversal {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class inorderTree{
        static int idx = -1;

        public static void inorder(Node root){
            if(root == null){
                return;
            }
            inorder(root.left);
            System.out.println(root.data + " ");
            inorder(root.right);
        }


    }

    public static void main(String[] args) {
        int Nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        inorderTree it = new inorderTree();
        //Node root = tree.inorder(nodes);
    }
}
