package ThirtyDaysOfCode;

import java.io.*;
import java.util.*;

/**
 * Created by Andrei on 30.07.2017.
 */
class NodeLinkedLists{
    int data;
    NodeLinkedLists next;
    NodeLinkedLists(int d){
        data=d;
        next=null;
    }

}

public class MoreLinkedLists {
    public static NodeLinkedLists removeDuplicates(NodeLinkedLists head) {
        //Write your code here
        NodeLinkedLists start = head;
        while(start != null)
        {
            if (start.data == start.next.data){
                start.next = start.next.next;
            }
            start=start.next;
        }
        return head;
    }

    public static  NodeLinkedLists insert(NodeLinkedLists head,int data)
    {
        if(head == null)
            return null;
        NodeLinkedLists s = head;
        while(s.next != null){
            if(s.data == s.next.data)
                s.next = s.next.next;
            else
                s = s.next;
        }
        return head;
    }
    public static void display(NodeLinkedLists head)
    {
        NodeLinkedLists start=head;
        while(start!=null)
        {
            System.out.print(start.data+" ");
            start=start.next;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        NodeLinkedLists head=null;
        int T=sc.nextInt();
        while(T-->0){
            int ele=sc.nextInt();
            head=insert(head,ele);
        }
        head=removeDuplicates(head);
        display(head);

    }
}
