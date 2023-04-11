package datastructure;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Queue<String> oopsConcepts = new PriorityQueue<>();

		oopsConcepts.add("Inheritance");
		oopsConcepts.add("Encapsulation");
		oopsConcepts.add("Polymorphism");
		oopsConcepts.add("Abstraction");
		System.out.print("Queue: " + oopsConcepts +"\n");

		System.out.print("\nPeek: "+ oopsConcepts.peek()+"\n");

		oopsConcepts.remove("Abstraction");
		System.out.print("\nOOps Concept Removal: " + oopsConcepts+"\n");

		oopsConcepts.poll();
		System.out.println("\nQueue's Head: "+ oopsConcepts);

		Iterator <String> oops = oopsConcepts.iterator();
		System.out.print("\nWhile loop Queue: ");
		while(oops.hasNext()){
			System.out.print(oops.next()+ " ");
		}
		System.out.println();
		System.out.print("\nFor loop Queue: ");
		for (String oopsJava:oopsConcepts) {
			System.out.print(oopsJava+ " ");
		}

	}

}
