package com.dsaPractice.LinkedList;


class Node{
    int data;
    Node next;
    public Node(int data )
    {
        this.data = data;
        this.next = null;
    }
}

public class Main {
    public static void main(String[] args)
    {
         Node n1 = new Node(2);
         Node n2 = new Node(5);
         Node n3 = new Node(6);

         n1.next = n2;
         n2.next = n3;

         Node t = n1;
         while(t != null)
         {
             System.out.println(t.data);
             t = t.next;
         }
    }
}
