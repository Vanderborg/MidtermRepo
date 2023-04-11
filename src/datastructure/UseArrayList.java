package datastructure;

import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

	public static void space(){
		System.out.println();
	}
	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 *
		 */
		ArrayList <String> TestingTypes = new ArrayList<>();

		TestingTypes.add("BlackBox");
		TestingTypes.add("WhiteBox");
		TestingTypes.add("Unit");
		TestingTypes.add("Integration");
		TestingTypes.add("System");
		TestingTypes.add("Usability");
		TestingTypes.add("Hinata");
		TestingTypes.add("UAT");
		TestingTypes.add("Smoke");
		TestingTypes.add("Regression");
		TestingTypes.add("Sanity");

		System.out.println("ArrayList: "+ TestingTypes);

		System.out.println("Peek: "+ TestingTypes.get(5));

		String remove = TestingTypes.remove(7);
		System.out.println("Remove: " + remove);

		System.out.print("For each loop: ");

		Iterator<String> IntelliJ = TestingTypes.iterator();

		for(String str : TestingTypes){
			System.out.print(str + ", ");
		}
		space();
		System.out.print("While each loop: ");
		while(IntelliJ.hasNext()){
			System.out.print(IntelliJ.next() + ", ");
		}
	}
}