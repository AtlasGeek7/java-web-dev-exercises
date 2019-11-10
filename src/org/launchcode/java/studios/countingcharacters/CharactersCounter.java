package org.launchcode.java.studios.countingcharacters;
import java.util.HashMap;
import java.util.Map;

public class CharactersCounter {
    public static void main (String[] args) {
        HashMap<Character, Integer> characters = new HashMap<>();
        String str = "If the product of two terms is zero then "
        		+ "common sense says at least one of the two terms "
        		+ "has to be zero to start with. So if you move all "
        		+ "the terms over to one side, you can put the quadratics "
        		+ "into a form that can be factored allowing that side of "
        		+ "the equation to equal zero. Once you’ve done that, "
        		+ "it’s pretty straightforward from there.";
        int cnt = 1;
        char c;
        int len = str.length();
        for (int i=0; i<len-1; i++) {
        	c = str.charAt(i);
        	for (int j=1; j<len; j++) {
        		if (c == str.charAt(j)) {
        			cnt++;
        		}
        	}
        	characters.put(c, cnt);
        	cnt = 0;
        }
        for (Map.Entry<Character, Integer> character : characters.entrySet()) {
            System.out.println(character.getKey() + " : " + character.getValue());
        }
    }
}
