package com.uis.InterviewBit;

import java.util.PriorityQueue;

public class PriorityQueuePgm {

	public static void main(String[] args) {
		PriorityQueue<Integer> pqueue = new PriorityQueue<>();
		
		pqueue.add(21);
		pqueue.add(18);
		pqueue.add(36);
		pqueue.add(9);
		pqueue.add(41);
		pqueue.add(50);
		System.out.println(pqueue);
		
//	head element of the PriorityQueue always will be the least element. 
//	Let’s remove the elements of ‘pQueue’ one by one using poll() method ( poll() method removes the head of the queue ).
		
		System.out.println(pqueue.poll());
		System.out.println(pqueue.poll());
		System.out.println(pqueue.poll());
		System.out.println(pqueue.poll());
		System.out.println(pqueue.poll());
		System.out.println(pqueue.poll());
		System.out.println(pqueue.poll());// no element present return null

		
		PriorityQueue<String> pq = new PriorityQueue<>();
		pq.add("blue");
		pq.add("red");
		pq.add("pink");
		pq.add("green");
		pq.add("yellow");
		pq.add("white");
		System.out.println(pq);
	}

}
