class Solution {
    public String gcdOfStrings(String str1, String str2) {
        // If str1 + str2 is not equal to str2 + str1, there's no common divisor string
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
       
        
        // Find the greatest common divisor (GCD) of the lengths of the two strings
        int gcdLength = gcd(str1.length(), str2.length());
        
        // The GCD string is the prefix of str1 or str2 up to the gcd length
        return str1.substring(0, gcdLength);
    }
    
    // Helper method to calculate the GCD of two integers
    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

}