package ThirtyDaysOfCode;

import java.io.*;
import java.util.*;

/**
 * Created by Andrei on 30.07.2017.
 */
class NodeTraversal {
    NodeTraversal left;
    NodeTraversal right;
    int data;
    NodeTraversal(int data){
        this.data=data;
        left=right=null;
    }
}

public class BSTLevelOrderTraversal {
    static void levelOrder(NodeTraversal root){
        //Write your code here
        Queue<NodeTraversal> queue = new LinkedList();
        queue.add(root);

        while(!queue.isEmpty()){
            NodeTraversal current = queue.remove();
            System.out.print(current.data + " ");
            if (current.left!=null) queue.add(current.left);
            if (current.right!=null) queue.add(current.right);
        }
    }

    public static NodeTraversal insert(NodeTraversal root,int data){
        if(root==null){
            return new NodeTraversal(data);
        }
        else{
            NodeTraversal cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        NodeTraversal root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        levelOrder(root);
    }
}
