package com.codegnan.collectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MergeAndSortLists {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		
		String line1 = sc.nextLine().trim();
		for(String s : line1.split("\\s+")) {
			if(!s.isEmpty())
				list.add(Integer.parseInt(s));
		}
		
		String line2 = sc.nextLine().trim();
		for(String s : line2.split("\\s+")) {
			if(!s.isEmpty())
				list.add(Integer.parseInt(s));
		}
		
		Collections.sort(list);
		
		for(int num : list) {
			System.out.print(num+" ");
		}
		sc.close();
	}

}
