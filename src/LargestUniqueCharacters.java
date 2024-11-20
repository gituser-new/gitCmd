import java.util.HashMap;
import java.util.HashSet;


/*

Matchingcharacter of string java program determine the largest number of unique characters that exists between a pair of mattching letters in the string

To determine the largest number of unique characters between a pair of matching letters in a string using Java, you can follow these steps:

	1.	Iterate over the string and store the first occurrence of each character in a map.
	2.	For each subsequent occurrence of a character, calculate the number of unique characters between its first occurrence and the current one.
	3.	Track the maximum number of unique characters found between any pair of matching letters.

 */
public class LargestUniqueCharacters {
    public static int maxUniqueCharsBetweenMatchingLetters(String str) {
        HashMap<Character, Integer> firstOccurrence = new HashMap<>();
        int maxUnique = 0;

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            // If the character has been seen before
            if (firstOccurrence.containsKey(currentChar)) {
                int startIndex = firstOccurrence.get(currentChar) + 1;  //calculate index of first ocurence plus 1
                int endIndex = i;
                System.out.println(firstOccurrence);
                System.out.println(startIndex+":"+endIndex);
                // Create a set to track unique characters
                HashSet<Character> uniqueChars = new HashSet<>();

                // Traverse the substring between the two matching letters
                for (int j = startIndex; j < endIndex; j++) {
                    uniqueChars.add(str.charAt(j));
                }
                System.out.println(uniqueChars);

                // Update the maximum unique character count
                maxUnique = Math.max(maxUnique, uniqueChars.size());
                System.out.println(maxUnique);
            } else {
                // Record the first occurrence of the character
                firstOccurrence.put(currentChar, i);
            }
        }

        return maxUnique;
    }

    public static void main(String[] args) {
       // String str = "abcba";
        String str = "abcefba";
        int result = maxUniqueCharsBetweenMatchingLetters(str);
        System.out.println("Maximum number of unique characters between matching letters: " + result);
    }
}

/*
Explanation:

	•	firstOccurrence Map: This map stores the first occurrence of each character with the index. key value pair
	•	maxUnique: This variable keeps track of the maximum number of unique characters found between any pair of matching letters.
	•	HashSet: The set is used to track unique characters between two matching letters.

 */