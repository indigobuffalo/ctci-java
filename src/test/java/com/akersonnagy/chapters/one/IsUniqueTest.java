package com.akersonnagy.chapters.one;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class IsUniqueTest {

    @Test
    public void testHasAllUniqueCharacters() {
        IsUnique checker = new IsUnique();
        assertTrue(checker.hasAllUniqueCharacters("abcdefg"));
        assertFalse(checker.hasAllUniqueCharacters("hello"));
    }
}
