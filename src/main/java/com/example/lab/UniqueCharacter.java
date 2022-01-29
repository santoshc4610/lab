package com.example.lab;

import java.util.ArrayList;
import java.util.Scanner;

public class UniqueCharacter {
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        ArrayList<Character> Unqchr= new ArrayList<>();
        boolean flag;
        System.out.println(str.length());
        for (int i =0 ; i< str.length(); i ++)
        {
            flag = false;
            for (int j =0; j< str.length(); j++)
            {
                if (i !=j) {
                    if (str.charAt(i) == str.charAt(j))
                        flag = true;
                }

            }
            if(!flag)
            {
                Unqchr.add(str.charAt(i));
            }
        }

        System.out.println(Unqchr.indexOf('b'));
    }

}
