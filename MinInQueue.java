package com.codegnan.collectionFramework;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class MinInQueue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String line = sc.nextLine().trim();
		String[] parts = line.split("\\s+");
		
		Queue<Integer> pq = new PriorityQueue<>();
		
		for(String s : parts) {
			if(!s.isEmpty()) {
				pq.add(Integer.parseInt(s));
			}
		}
		
		System.out.print(pq.peek());
		sc.close();
			
	}

}
