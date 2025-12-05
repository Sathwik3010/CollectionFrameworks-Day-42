package com.codegnan.collectionFramework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class ListSubsetSet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 String[] listInput = sc.nextLine().split(" ");
	     List<Integer> list = new ArrayList<>();
	     for(String s : listInput) {
	    	 list.add(Integer.parseInt(s));
	     }
	     
	     String[] setInput = sc.nextLine().split(" ");
	        Set<Integer> set = new HashSet<>();
	        for (String s : setInput) {
	            set.add(Integer.parseInt(s));
	        }
	        
	     boolean isSubset = set.containsAll(list);
	     
	     System.out.println(isSubset);
		sc.close();
	}

}
