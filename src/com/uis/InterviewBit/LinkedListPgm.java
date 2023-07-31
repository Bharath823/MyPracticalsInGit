package com.uis.InterviewBit;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListPgm {

	public static void main(String[] args) {
		LinkedList<String> llist = new LinkedList<>();
		llist.add("Red");
		llist.add("Blue");
		llist.add("White");
		System.out.println(llist);
		Iterator<String> itr = llist.descendingIterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	//	Write a Java program which implements LinkedList as a Queue (FIFO)?

	//			Use the offer() and poll() methods which make LinkedList to work as a Queue.
		
		LinkedList<Integer> queue = new LinkedList<>();
		
		System.out.println("\n"+"LinkedList as Queue");
		queue.offer(10);
		queue.offer(20);
		queue.offer(30);
		queue.offer(40);
		System.out.println(queue);
		
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		
		System.out.println(queue);
		
	//adding elements first
		queue.offerFirst(10);
		queue.offerFirst(20);
		queue.offerLast(50);
		queue.offerLast(60);
		queue.addFirst(00);
		queue.addLast(100);
		System.out.println("\n"+queue);
		
	//	Removing the elements from the head of the LinkedList	
		queue.poll();
		queue.remove();
		queue.removeFirst();
		queue.pollFirst();
		System.out.println(queue);
		
	//	Removing elements from the end of the LinkedList
		queue.removeLast();
		queue.pollLast();
		System.out.println(queue);
		
	}

}
