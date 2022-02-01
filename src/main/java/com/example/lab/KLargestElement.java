package com.example.lab;

import java.util.*;

/**
 * This program will intake the list of numbers and output the Kth smallest element in it.
 * **/

public class KLargestElement {

    public List<Integer> al;
    //public List<Integer> sl;
    public int k;
    /** Getters and setters **/
    public List<Integer> getAl() {
        return al;
    }

    public void setAl(List<Integer> al) {
        this.al = al;
    }

    /**public List<Integer> getSl() {
        return sl;
    }

    public void setSl(List<Integer> sl) {
        this.sl = sl;
    }**/

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }
    /** Getters and setters **/

    public KLargestElement(List<Integer> al, int k) {
        this.al = al;
       // this.sl = sl;
        this.k = k;
    }

    public List<Integer> sortTheList (List<Integer> arr1)
    {
        Integer arr2[] = new Integer[arr1.size()];
        arr2 = arr1.toArray(arr2);
        int temp = 0;
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

        return Arrays.asList(arr2);
    }

    public int findtheKthLargestNumber(List<Integer> List1, int k)
    {
        System.out.println("The "+k+"th Smallest element is::"+List1.get(k-1));
        return List1.get(k-1);
    }

}

