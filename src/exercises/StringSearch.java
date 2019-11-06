package exercises;

import java.util.Scanner;

public class StringSearch {
	public static void main(String[] args) {
		String sentence = "Alice was beginning to get very tired of sitting by "
				+ "her sister on the bank, and of having nothing to do: once or "
				+ "twice she had peeped into the book her sister was reading, but"
				+ " it had no pictures or conversations in it, 'and what is "
				+ "the use of a book,' thought Alice 'without pictures or conversation?'";
		System.out.println(sentence);
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a term to search for within the sentence above: ");
		String term = input.nextLine();
		input.close();
		term = term.toLowerCase();
		if (sentence.toLowerCase().contains(term)) {
			System.out.println("The search term was found.");
			int idx = sentence.toLowerCase().indexOf(term);
			int sentenceLen = sentence.length();
			int termLen = term.length();
			System.out.println("Its index within the string is: " + idx + '.');
			System.out.println("Its length is: " + termLen + " characters.");
			System.out.println("Removing it from the sentence...");
			String copy = "  " + sentence;
			System.out.println(sentence.substring(0,idx) + sentence.substring(idx+termLen,sentenceLen));
		} else {
			System.out.println("The search term was not found.");
		}
	}
	

}
