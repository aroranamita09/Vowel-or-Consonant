package com.stackroute;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VowelAndConsonantsTest {
   VowelAndConsonants obj;
    @Before
    public void setUp() throws Exception {
        obj = new VowelAndConsonants();
    }

    @After
    public void tearDown() throws Exception {
        obj = null;
    }

    @Test
    public void checkVowelAndConsonantsTest() {
        assertEquals("consonant",obj.checkVowelAndConsonants('q'));
        assertEquals("vowel",obj.checkVowelAndConsonants('e'));
        assertEquals("vowel",obj.checkVowelAndConsonants('a'));
        assertEquals("vowel",obj.checkVowelAndConsonants('i'));
        assertEquals("vowel",obj.checkVowelAndConsonants('o'));

    }
    @Test
    public void printVowelConsonantsTest(){
        assertEquals("i-vowel",obj.printVowelConsonants("nami"));
    }

}
