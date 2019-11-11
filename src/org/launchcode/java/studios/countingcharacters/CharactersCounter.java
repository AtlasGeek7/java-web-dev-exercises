package org.launchcode.java.studios.countingcharacters;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharactersCounter {
    public static void main (String[] args) {
        HashMap<Character, Integer> characters = new HashMap<>();
        
        // hard-coding some text and storing it in a variable...
        /*
        String str = "If the product of two terms is zero then "
        		+ "common sense says at least one of the two terms "
        		+ "has to be zero to start with. So if you move all "
        		+ "the terms over to one side, you can put the quadratics "
        		+ "into a form that can be factored allowing that side of "
        		+ "the equation to equal zero. Once you’ve done that, "
        		+ "it’s pretty straightforward from there.";
       */
        
        // Prompting the user to enter the string in the command line...
        /*
        Scanner in = new Scanner(System.in);
		System.out.println("Enter your string: ");
		String str = in.nextLine();
		str = str.toLowerCase();
		in.close();
		*/
        
        // Reading the string in from a file...
        //*
        String str = FileReader.readTxt("C:\\Users\\Owner\\git\\java-web-dev-exercises\\src\\org\\launchcode\\java\\studios\\countingcharacters\\text.txt");
        str = str.toLowerCase();
        // */
        
        int cnt = 0;
        char c;
        int len = str.length();
        for (int i=0; i<len; i++) {
        	c = str.charAt(i);
        	if (str.substring(i,i+1).matches("^[a-z]*$")) {
	        	for (int j=0; j<len; j++) {
	        		if (c == str.charAt(j)) {
	        			cnt++;
	        		}
	        	}
        	characters.put(c, cnt);
        	cnt = 0;
        	}
        }
        for (Map.Entry<Character, Integer> character : characters.entrySet()) {
            System.out.println(character.getKey() + " : " + character.getValue());
        }
    }
}
