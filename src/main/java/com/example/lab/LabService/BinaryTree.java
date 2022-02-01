package com.example.lab.LabService;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTree {

    static boolean added= false;


    Node root; /** The root node will be set only once in the lifetime**/
    public static class Node
    {

        int Data;
        Node Left;
        Node Right;
        public Node(int d)
        {
            Left=null;
            Right =null;
            Data=d;
        }
    }

    public static boolean traverseTree (Node lastNode,int parent,int data, String direction)
    {
        Node childNode = new Node(data);
        childNode.Left = null;
        childNode.Right = null;
            if(lastNode != null) {
                if (lastNode.Data == parent) {

                    if (direction.equals("L"))
                    {

                        lastNode.Left = childNode;
                    } else if (direction.equals("R"))
                    {
                        lastNode.Right = childNode;
                    }

                    return true;
                } else {

                    traverseTree(lastNode.Left, parent, data, direction);
                    traverseTree(lastNode.Right, parent, data, direction);
                }

            }

        return true;
    }

    public static BinaryTree ConstructBinaryTree(BinaryTree bt2,int parent, int data, String direction)
    {
        Node lastNode = bt2.root;
        if((bt2.root == null) ) /** Setting the root node for the binary tree**/
        {
            System.out.println("enters to create root");
            Node new_node = new Node(data);
            new_node.Left = null;
            new_node.Right = null;
            bt2.root = new_node;
        }
        else
        {
          traverseTree(lastNode,parent,data,direction);
           bt2.root = lastNode;
        }
        return bt2;
    }

/** Breadth First search Algorithm using queue**/
    public static void printTheTree(Node root, int i)
    {
        Queue<Node> que= new LinkedList<Node>();
        que.add(root);
        int h =i;
        String str= new String();
        for (int k = 0;k<=h;k++)
        {
            str = str + " ";
        }
        while (!que.isEmpty())
        {
            Node temp_node = que.poll();
            System.out.println(str+temp_node.Data);

            if(temp_node.Left != null)
                printTheTree(temp_node.Left,h+1);
            if(temp_node.Right != null)
                printTheTree(temp_node.Right,h+1);
        }
    }


    public static void main (String args[])
    {

        Scanner sc = new Scanner(System.in);
        BinaryTree bt = new BinaryTree();
        bt.root = null;
        System.out.println("Enter the total no of elements for the B-tree");
        int num = sc.nextInt();
        int j=10;

        for (int i=0; i <num ; i++)
        {
            System.out.println("Enter the Root "+i);
            int parent = sc.nextInt();
            System.out.println("Enter the Child"+i);
            int data = sc.nextInt();
            System.out.println("Enter the Direction"+i);
            String direction = sc.next();

            bt = bt.ConstructBinaryTree(bt,parent,data,direction);
        }
        Node root = bt.root;
        printTheTree(root,j);
        TreeIn2D t2 = new TreeIn2D();
        System.out.println("Printing the B-Tree in 2D");
        t2.printTreeIn2D(root,10);
        /** Calling mirror the tree to give the reversed B Tree**/
        MirrorTree mt = new MirrorTree();
        System.out.println("Calling Mirror Method to mirror the B-Tree");
        mt.mirrorTheTree(bt);
        System.out.println("The Mirror B-Tree::");
        printTheTree(root,j);
    }
}
