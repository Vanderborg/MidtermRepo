package datastructure;

import java.util.*;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */

		Map <String,List<String>> banks = new HashMap<>();

		banks.put("Bank1",Arrays.asList("Chase"));
		banks.put("Bank2",Arrays.asList("HSBC"));
		banks.put("Bank3",Arrays.asList("TD"));
		banks.put("Bank4",Arrays.asList("BOA"));

		Iterator<List<String>> federalreserve = banks.values().iterator();

		System.out.print("For each loop: ");
		for (List<String> valuesOfBanks : banks.values()){
			System.out.print(valuesOfBanks+",");
		}
		UseArrayList.space();
		UseArrayList.space();

		System.out.print("While each loop: ");
		while (federalreserve.hasNext()){
			List<String> valuesOfBanks = federalreserve.next();
			System.out.print(valuesOfBanks +",");
		}

	}

}
