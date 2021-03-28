import com.hodei.expleo.Anagram;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Created by Hodei Eceiza
 * Date: 3/27/2021
 * Time: 22:54
 * Project: Expleo
 * Copyright: MIT
 */
public class AnagramTest {
    private Anagram anagram;
    @BeforeEach
    public void setUp(){
        anagram=new Anagram();
    }
    @Test
    public void isEmpty(){
        assertTrue(anagram.isEmpty("",""));
        assertTrue(anagram.isEmpty("ma",""));
        assertTrue(anagram.isEmpty("","ma"));
    }
    @Test
    public void sameLength(){
       assertTrue(anagram.sameLength("mary","Army"));
        assertTrue(anagram.sameLength("may","amy"));
        assertFalse(anagram.sameLength("may",""));
        assertFalse(anagram.sameLength("armyya","army"));
    }
    @Test
    public void sameCharacters(){
        assertTrue(anagram.sameCharacters("mary","Army"));
        assertTrue(anagram.sameCharacters("yram","myra"));
        assertTrue(anagram.sameCharacters("uuu","uuu"));
        assertTrue(anagram.sameCharacters("uuu op","op uuu"));

    }
    @Test
    public void areAnagrams(){
        assertTrue(anagram.areAnagrams("mary","Army"));
        assertTrue(anagram.areAnagrams("mary owl","low Army"));
        assertTrue(anagram.areAnagrams("SANA","nasa"));
        assertTrue(anagram.areAnagrams("On","No"));
        assertFalse(anagram.areAnagrams("","Army"));
        assertFalse(anagram.areAnagrams("mary leia","Army lei"));

    }
}
