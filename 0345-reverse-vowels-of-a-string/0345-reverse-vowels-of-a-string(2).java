class Solution {
    public String reverseVowels(String s) {
        char[] array = s.toCharArray();

        // Step 1: Collect only the vowels in a StringBuilder
        StringBuilder vowels = new StringBuilder();
        for (char c : array) {
            if (isVowel(c)) {
                vowels.append(c);
            }
        }

        // Step 2: Replace vowels in reverse order
        int j = vowels.length() - 1;
        for (int i = 0; i < array.length; i++) {
            if (isVowel(array[i])) {
                array[i] = vowels.charAt(j--);
            }
        }

        return new String(array);
    }

    // Helper method inside the class
    private boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}
