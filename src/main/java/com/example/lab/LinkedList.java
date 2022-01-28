package com.example.lab;

import java.util.Scanner;

public class LinkedList {
    Node head;
/** This class is to declare the Node of the Linkedlist.
 * Each node will have a "next" node which contains the pointer to the next node**/
    static class Node
    {
        int data;
        Node next;

        Node(int d)
        {
            data =d;
            next = null;
        }

    }

    public static LinkedList CreateLinkedList(LinkedList list1, int data)
    {
        Node new_node = new Node(data);
        new_node.next = null;
        Node last;

        if(list1.head == null) {
            list1.head = new_node;
        }
        else
        {
            last = list1.head;
            while(last.next != null)
            {
                last = last.next;
            }
            last.next = new_node;
        }

        return list1;
    }

    public static LinkedList ReverseALinkedList (LinkedList list2)
    {
        LinkedList revList = new LinkedList();
        Node curr= list2.head;
        Node prev = null;
        Node next;

        while(curr != null)
        {
            next = curr.next;
            curr.next = prev;
            prev =curr;
            curr= next;

        }
        list2.head = prev;
        revList = list2;

        return revList;
    }

    public static void PrintTheList(LinkedList list)
    {
        Node curr_node = list.head;
        while (curr_node != null)
        {
            System.out.println(curr_node.data);
            curr_node = curr_node.next;
        }
    }

public static void main (String args[]) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number elements for the linked list::");
    int NoOfElements = sc.nextInt();
    LinkedList list = new LinkedList();
    LinkedList RevList = new LinkedList();


    for (int i = 0; i < NoOfElements; i++)
    {
       list = CreateLinkedList(list,sc.nextInt());

    }
    System.out.println("Linked List created is ::");

    PrintTheList(list);

    System.out.println("Calling the Reverse linkedList ::");

    RevList = ReverseALinkedList(list);

    System.out.println("The Reversed Linked List is ::");
    PrintTheList(RevList);



}

}
