// Last updated: 12/28/2025, 4:52:10 PM
import java.util.HashSet;

public class Solution {
    public boolean isValid(String word) {
        if (word.length() < 3) {
            return false;
        }
        
        boolean v = false;
        boolean c = false;
        boolean d = true;
        boolean l = true;
        boolean u = true;

        // Check if the word contains at least one vowel and one consonant
        HashSet<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');

        HashSet<Character> consonants = new HashSet<>();
        consonants.add('b');
        consonants.add('c');
        consonants.add('d');
        consonants.add('f');
        consonants.add('g');
        consonants.add('h');
        consonants.add('j');
        consonants.add('k');
        consonants.add('l');
        consonants.add('m');
        consonants.add('n');
        consonants.add('p');
        consonants.add('q');
        consonants.add('r');
        consonants.add('s');
        consonants.add('t');
        consonants.add('v');
        consonants.add('w');
        consonants.add('x');
        consonants.add('y');
        consonants.add('z');
        consonants.add('B');
        consonants.add('C');
        consonants.add('D');
        consonants.add('F');
        consonants.add('G');
        consonants.add('H');
        consonants.add('J');
        consonants.add('K');
        consonants.add('L');
        consonants.add('M');
        consonants.add('N');
        consonants.add('P');
        consonants.add('Q');
        consonants.add('R');
        consonants.add('S');
        consonants.add('T');
        consonants.add('V');
        consonants.add('W');
        consonants.add('X');
        consonants.add('Y');
        consonants.add('Z');

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (vowels.contains(ch)) {
                v = true;
            } else if (consonants.contains(ch)) {
                c = true;
            } else if (Character.isDigit(ch)) {
                d = true;
            } else if (Character.isLetter(ch)) {
                if (Character.isUpperCase(ch)) {
                    u = true;
                } else {
                    l = true;
                }
            } else {
                return false;
            }
        }

        return v && c && d && l && u;
    }
}
