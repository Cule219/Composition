package Practice;

public class binaryPatternMatching {
	static int binaryPatternMatching(String pattern, String s) {
	    String p = "aeiouy";
	    char [] pa = pattern.toCharArray();
	    char [] ca = s.toCharArray();
	    int pp = 0;
	    int os = 0;
	    for(int i = 0; i < s.length(); i++) {
	        if((pa[pp] == '0' && p.indexOf(ca[i]) != -1) || (pa[pp] == '1' && p.indexOf(ca[i]) == -1 )) {
	            ++pp;
	            if(pp >= pattern.length()) {
	                os++;
	                pp = 0;
	                i = i - pattern.length() + 1;
	            }
	        } else {
	           pp = 0;
	        }
	    }
	    return os;
	}
	/**
	 * 
You are given two strings pattern and s. The first string pattern contains only the symbols 0 and 1, and the second string s contains only lowercase English letters.

Let's say that pattern matches a substring s[l..r] of s if the following 3 conditions are met:

    they have equal length;
    for each 0 in pattern the corresponding letter in the substring is a vowel;
    for each 1 in pattern the corresponding letter is a consonant.

Your task is to calculate the number of substrings of s that match pattern.

Note: In this task we define the vowels as 'a', 'e', 'i', 'o', 'u', and 'y'. All other letters are consonants.

Example

    For pattern = "010" and s = "amazing", the output should be binaryPatternMatching(pattern, s) = 2.

example

    "010" matches s[0..2] = "ama", because both 0s match a, which is a vowel, and 1 match m, which is a consonant;
    "010" doesn't match s[1..3] = "maz", because the first 0 corresponds to an m, which is a consonant, not a vowel;
    "010" matches s[2..4] = "azi", because the first 0 matches an a (vowel), 1 matches z (consonant), and the second 0 matches i (vowel);
    "010" doesn't match s[3..5] = "zin", because the first 0 corresponds to a consonant (z);
    "010" doesn't match s[4..6] = "ing", because the second 0 corresponds to the letter g, which is a consonant.

So, there are only 2 matches.

    For pattern = "100" and s = "codesignal", the output should be binaryPatternMatching(pattern, s) = 0.

    There are no double vowels in the string "codesignal", so it's not possible for any of its substrings to match this pattern.

Input/Output

    [execution time limit] 3 seconds (java)

    [input] string pattern

    A string of 0s and 1s.

    Guaranteed constraints:
    1 ≤ pattern.length ≤ 103.

    [input] string s

    A string of lowercase English letters.

    Guaranteed constraints:
    1 ≤ s.length ≤ 103.

    [output] integer
        The number of substrings of s that match pattern.

[Java] Syntax Tips
 */
	
}
