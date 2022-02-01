package com.example.lab.LabService;
import com.example.lab.LabService.BinaryTree.*;

import java.util.LinkedList;
import java.util.Queue;

public class TreeIn2D {

    public static void printTreeIn2D(Node node, int j)
    {
        int count =j;
        Queue<Node> qu = new LinkedList<>();
        if(node == null)
            return;
        qu.add(node);
        String str = new String();
        for (int i =0 ;i<count; i++)
            str = str+ " ";

        while(!qu.isEmpty())
        {
            qu.poll();
            //System.out.println("\n");
            printTreeIn2D(node.Right,count+8);
            if(node != null)
            System.out.println("\t"+str + node.Data + "\n");

            printTreeIn2D(node.Left,count+8);

        }




    }

}
