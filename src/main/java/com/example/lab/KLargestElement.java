package com.example.lab;

import java.util.*;

/**
 * This program will intake the list of numbers and output the Kth smallest element in it.
 * **/


public class KLargestElement {

    public static void main(String args[])
    {
        List<Integer> arr1 = new ArrayList<Integer>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of array list elements");
        int num = sc.nextInt();
        int temp = 0;
        System.out.println("Enter the  "+ num +" Elements");
        while (num >0)
        {
            arr1.add(sc.nextInt());
            num--;
        }


        System.out.println("Enter the nth smallest element needed::");
       int k=sc.nextInt();
       Integer arr2[] = new Integer[arr1.size()];
       arr2 = arr1.toArray(arr2);

       System.out.println("Original Array::"+arr1);

       for (int i =0 ; i< arr2.length;i++ )
       {
           for (int j =i+1; j< arr2.length; j++)
           {
                if (arr2[i] > arr2[j])
                {
                    temp = arr2[i];
                    arr2[i] = arr2[j];
                    arr2[j] = temp;
                }

           }

       }

       System.out.println("The "+k+"th Smallest element is::"+Arrays.asList(arr2).get(k-1));


    }

}

