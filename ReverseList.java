package com.codegnan.collectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReverseList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String line = sc.nextLine().trim();
		String[] parts = line.split("\\s+");
		
		List<Integer> list = new ArrayList<>();
		
		for(String s : parts) {
			if(!s.isEmpty()) {
				list.add(Integer.parseInt(s));
			}
		}
		
		Collections.reverse(list);
		
		for(int num: list) {
			System.out.print(num+" ");
		}
		sc.close();
	}

}
