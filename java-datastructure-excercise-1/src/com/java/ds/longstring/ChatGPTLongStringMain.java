package com.java.ds.longstring;

import java.util.*;

public class ChatGPTLongStringMain {
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        Map<Character, Integer> map = new HashMap<>();
        
        for (int i = 0, j = 0; j < n; j++) {
        	System.out.println("i : "+i+" j: "+j+" s.charAt(j) : "+s.charAt(j));
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
                System.out.println("i : "+i);
            }
            System.out.println("maxLength : "+maxLength+" Math.max(maxLength, j - i + 1) : "+Math.max(maxLength, j - i + 1));
            maxLength = Math.max(maxLength, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        
        return maxLength;
    }

    public static void main(String[] args) {
       // String s1 = "abcaabcbb";
    	String s1 = "abccabda";
        String s2 = "bbbbb";
        String s3 = "pwwkew";
        
        System.out.println("Input: s = \"" + s1 + "\"");
        System.out.println("Output: " + lengthOfLongestSubstring(s1));
        
        System.out.println("\nInput: s = \"" + s2 + "\"");
       // System.out.println("Output: " + lengthOfLongestSubstring(s2));
        
        System.out.println("\nInput: s = \"" + s3 + "\"");
        // System.out.println("Output: " + lengthOfLongestSubstring(s3));
    }
}
