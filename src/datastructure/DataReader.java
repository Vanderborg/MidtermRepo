package datastructure;


import java.io.*;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.LinkedList;
import java.util.Stack;

public class DataReader {
	public static void whiteSpace(){
		System.out.println();
	}
	public static void main(String[] args) {
		/*
		 * Use API to read the below textFile and print to console.
		 * Use BufferedReader class.
		 * Use try....catch block to handle Exception.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
		 * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
		 * order from LinkedList and retrieve as FILO order from Stack.
		 *
		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
		 * Use For Each loop/while loop/Iterator to retrieve data.
		 */

		String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car";

		FileReader fileReader = null;
		BufferedReader reader = null;

		try {
			fileReader = new FileReader(textFile);
			reader = new BufferedReader(fileReader);
			String line;
			Stack<String> stack = new Stack<>();
			LinkedList<String> linkedList = new LinkedList<>();
			while ((line = reader.readLine()) != null) {
				String[] words = line.split(" ");
				for (String word : words) {
					stack.push(word);
					linkedList.add(word);
				}
				System.out.println(line);
			}
			System.out.println();
			System.out.println("FIFO order from LinkedList: ");
			for (String word : linkedList) {
				System.out.print(word + " ");
			}
			whiteSpace();
			whiteSpace();
			System.out.println("FILO order from Stack: ");
			while (!stack.isEmpty()){
				System.out.print(stack.pop()+" ");
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (reader != null) {
					reader.close();
				}
				if (fileReader != null) {
					fileReader.close();
				}
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}

