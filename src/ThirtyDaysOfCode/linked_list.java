package ThirtyDaysOfCode;

import java.util.*;

/**
 * Created by Andrei on 16.07.2017.
 */
class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

public class linked_list {
    public static  Node insert(Node head,int data) {
        //Complete this method
        display(head);
        Node insert = new Node(data);
        return insert;
    }

    public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }
}
