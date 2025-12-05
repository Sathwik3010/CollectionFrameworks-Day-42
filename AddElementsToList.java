package com.codegnan.collectionFramework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddElementsToList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			list.add(sc.nextInt());
		}
		
		for(int num: list) {
			System.out.print(num+" ");
		}
		
		sc.close();
	}

}
