class Solution {
    public String mergeAlternately(String word1, String word2) {
         StringBuilder mergedString = new StringBuilder();
        
        int i = 0, j = 0;
        int len1 = word1.length(), len2 = word2.length();
        
        // Merge the strings by alternating characters
        while (i < len1 && j < len2) {
            mergedString.append(word1.charAt(i++));
            mergedString.append(word2.charAt(j++));
        }
        
        // If there are remaining characters in word1
        while (i < len1) {
            mergedString.append(word1.charAt(i++));
        }
        
        // If there are remaining characters in word2
        while (j < len2) {
            mergedString.append(word2.charAt(j++));
        }
        
        return mergedString.toString();

    }
}