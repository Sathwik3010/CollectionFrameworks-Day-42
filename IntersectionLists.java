package com.codegnan.collectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class IntersectionLists {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] input1 = sc.nextLine().split(" ");
        List<Integer> list1 = new ArrayList<>();
        for(String s : input1) {
        	list1.add(Integer.parseInt(s));
        }
        
        String[] input2 = sc.nextLine().split(" ");
        List<Integer> list2 = new ArrayList<>();
        for (String s : input2) {
            list2.add(Integer.parseInt(s));
        }
        
        list1.retainAll(list2);
        
        Collections.sort(list1);
        
        for(int num : list1) {
        	System.out.println(num+" ");
        }
        sc.close();
	}

}
