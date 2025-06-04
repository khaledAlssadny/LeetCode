import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max = 0;

        // Step 1: Find the maximum candies any kid currently has
        for (int candy : candies) {
            if (candy > max) {
                max = candy;
            }
        }

        // Step 2: Check for each kid
        for (int candy : candies) {
            result.add(candy + extraCandies >= max);
        }

        return result;
    }
}
