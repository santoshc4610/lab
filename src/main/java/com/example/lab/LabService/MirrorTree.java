package com.example.lab.LabService;

import com.example.lab.LabService.BinaryTree.*;
import java.util.LinkedList;
import java.util.Queue;

/** The Program will reverse the B-Tree**/
public class MirrorTree {

    public void changeTheNodes(Node node)
    {
        Queue<BinaryTree.Node> qu = new LinkedList<>();
        qu.add(node);
        Node temp;

        while(!qu.isEmpty())
        {
            qu.poll();
            temp = node.Left;
            node.Left = node.Right;
            node.Right = temp;

            if(node.Left != null) {
            changeTheNodes(node.Left);
            }
            if(node.Right != null) {
                changeTheNodes(node.Right);
            }
        }
    }

    public BinaryTree mirrorTheTree(BinaryTree bt)
    {
        BinaryTree mt;

        changeTheNodes(bt.root);
        mt =bt;
        return mt;
    }
}
