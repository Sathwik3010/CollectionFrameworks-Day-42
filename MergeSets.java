package com.codegnan.collectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class MergeSets {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] input1 = sc.nextLine().split(" ");
		Set<Integer> set1 = new HashSet<>();
		for(String s : input1) {
			set1.add(Integer.parseInt(s));
		}
		
		String[] input2 = sc.nextLine().split(" ");
		Set<Integer> set2 = new HashSet<>();
		for(String s : input2) {
			set2.add(Integer.parseInt(s));
		}
		
		set1.addAll(set2);
		
		List<Integer> mergedList = new ArrayList<>(set1);
		
		Collections.sort(mergedList);
		
		for(int num : mergedList) {
			System.out.print(num+" ");
		}
		sc.close();
	}

}
