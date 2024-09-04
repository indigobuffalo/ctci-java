/*
1.1
Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures?
Hints: #44, #117, #132
*/

package com.akersonnagy.chapters.one;

import java.util.HashSet;
import java.util.Set;

public class IsUnique {

    public boolean hasAllUniqueCharacters(String input) {
        Set<Character> charSet = new HashSet<>();
        for (char c : input.toCharArray()) {
            if (charSet.contains(c)) {
                return false;
            }
            charSet.add(c);
        }
        return true;
    }
}
