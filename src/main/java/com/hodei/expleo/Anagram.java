package com.hodei.expleo;

import java.util.Arrays;

/**
 * Created by Hodei Eceiza
 * Date: 3/27/2021
 * Time: 22:51
 * Project: Expleo
 * Copyright: MIT
 */
public class Anagram {
    /**
     * uses nested simple methods (could be refractored to do everthing using the same method, but TDD took me to do it like this)
     */
    public static boolean areAnagrams(String s1, String s2) {
        return sameLength(s1,s2)&&!isEmpty(s1,s2)&&sameCharacters(s1,s2);
    }

    public static boolean sameLength(String s1, String s2){
        return s1.length()==s2.length();
    }
    public static boolean isEmpty(String s1,String s2){
        return s1.isEmpty()||s2.isEmpty();
    }
    public static boolean sameCharacters(String s1,String s2){
        char[] s1Sorted= s1.toLowerCase().toCharArray();
        char[] s2Sorted= s2.toLowerCase().toCharArray();
        Arrays.sort(s1Sorted);
        Arrays.sort(s2Sorted);
        return Arrays.equals(s1Sorted,s2Sorted);
    }
}
