package com.codegnan.collectionFramework;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class QueueReverse {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
        String[] input = sc.nextLine().split(" ");
        Queue<Integer> queue = new LinkedList<>();
        for (String s : input) {
            queue.add(Integer.parseInt(s));
        }
        
        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty()) {
            stack.push(queue.poll());
        }
        
        while(!stack.isEmpty()) {
        	System.out.println(stack.pop()+" ");
        }
		sc.close();
	}

}
