public class Main {
    // Boyer-Moore Voting Algorithm: O(n) time and O(1) extra space.
    static int majorityElement(int[] nums) {
        int candidate = 0, count = 0;

        for (int value : nums) {
            if (count == 0) candidate = value;
            count += (value == candidate) ? 1 : -1;
        }
        return candidate; // A majority element is guaranteed by the problem.
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        System.out.println("Input: nums = [2, 2, 1, 1, 1, 2, 2]");
        System.out.println("Output: " + majorityElement(nums));
    }
}
