import java.util.Stack;
class Solution {
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> vowels = new Stack<>();

        // Step 1: Collect all vowels in a stack
        for(char  c:chars){
            if(isVowel(c)){
                vowels.push(c);
            }
        }

        // Step 2: Replace vowels from stack (reversed order)
        for(int i = 0; i<chars.length ; i++){
            if(isVowel(chars[i])){
                chars[i] = vowels.pop();
            }
        }
        // return as a string
        return new String(chars);
 

}
       public static boolean isVowel(char c){
        return "aeiouAEIOU".indexOf(c) != -1;
}
}