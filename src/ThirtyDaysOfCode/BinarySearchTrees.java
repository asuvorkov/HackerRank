package ThirtyDaysOfCode;

import java.util.*;
import java.io.*;

/**
 * Created by Andrei on 30.07.2017.
 */
class NodeBinary{
    NodeBinary left;
    NodeBinary right;
    int data;
    NodeBinary(int data){
        this.data=data;
        left=right=null;
    }
}

public class BinarySearchTrees {
    public static int getHeight(NodeBinary root){
        //Write your code here
        if(root == null) {
            return -1;
        }

        int left = getHeight(root.left);
        int right = getHeight(root.right);

        return Math.max(left, right) + 1;
    }

    public static NodeBinary insert(NodeBinary root,int data){
        if(root==null){
            return new NodeBinary(data);
        }
        else{
            NodeBinary cur;
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
        NodeBinary root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        int height=getHeight(root);
        System.out.println(height);
    }
}
