import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

class linkedList {

    public static  Node insert(Node head,int data) {
        //Complete this method
        Node node = new Node(data);
        Node current = head;
        if(head==null){
            head = node;
            return head;
        }

        while(current.next != null) {
            current = current.next;
        }
        current.next = node;
        return head;
        // System.out.print(node.data + " ");


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