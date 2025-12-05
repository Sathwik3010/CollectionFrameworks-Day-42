package com.codegnan.collectionFramework;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SumOfQueue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		String[] arr = input.split("\\s+");
		Queue<Integer> queue = new LinkedList<>();
		for(String s : arr ) {
			queue.add(Integer.parseInt(s));
		}
		
		int sum=0;
		while(!queue.isEmpty()) {
			sum+=queue.poll();
		}
		
		System.out.println(sum);
		sc.close();
	}

}
