package com.codegnan.collectionFramework;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		Set<Integer> set = new LinkedHashSet<>();
		
		for(int i=0; i<size; i++) {
			set.add(sc.nextInt());
		}
		
		for(int num: set) {
			System.out.print(num+" ");
		}
		sc.close();
	}

}
