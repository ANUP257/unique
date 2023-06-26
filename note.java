package leetcode;
import java.util.HashMap;
import java.util.Map;

public class note {
	public static int firstUniqChar(String s) {
        Map<Character, Integer> countMap = new HashMap<>();

        // Count the frequency of each character in the string
        for (char c : s.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }

        // Find the first non-repeating character and return its index
        for (int i = 0; i < s.length(); i++) {
            if (countMap.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        // No non-repeating character found
        return -1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "leetcode";
        System.out.println("First non-repeating character index in \"" + s1 + "\": " + firstUniqChar(s1));

        
    }


	}


