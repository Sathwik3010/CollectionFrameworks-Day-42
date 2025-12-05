package com.codegnan.collectionFramework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemoveEvenNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		String[] arr = input.split(" ");
		
		List<String> result = new ArrayList<>();
		
		for(String num : arr) {
			int n = Integer.parseInt(num);
			
			if(n % 2 !=0) {
				result.add(num);
			}
		}
		
//		System.out.println(result);
		if(result.isEmpty()) {
			System.out.println("");
		} else {
			System.out.println(String.join(" ", result));
		}
		sc.close();
	}

}
