import java.util.HashMap;
import java.util.Map;

public class Main {
    // Store the most recent index of each value.
    static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> lastIndex = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (lastIndex.containsKey(nums[i]) &&
                i - lastIndex.get(nums[i]) <= k) {
                return true;
            }
            lastIndex.put(nums[i], i);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        int k = 3;
        System.out.println("Input: nums = [1, 2, 3, 1], k = 3");
        System.out.println("Output: " + containsNearbyDuplicate(nums, k));
    }
}
