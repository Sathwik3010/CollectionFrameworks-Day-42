package com.codegnan.collectionFramework;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class AddElementsToQueue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Queue<Integer> queue = new LinkedList<>();
		
		for(int i=0; i<n; i++) {
			queue.add(sc.nextInt());
		}
		
		while(!queue.isEmpty()) {
			System.out.print(queue.poll()+" ");
		}
		sc.close();
	}

}
