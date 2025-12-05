package com.codegnan.collectionFramework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SortSetToList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] input = sc.nextLine().split(" ");
		Set<Integer> treeSet = new TreeSet<>();
		
		for(String s : input) {
			treeSet.add(Integer.parseInt(s));
		}
		
        List<Integer> sortedList = new ArrayList<>(treeSet);

        for(int num: sortedList) {
        	System.out.print(num+" ");
        }
		sc.close();
	}

}
