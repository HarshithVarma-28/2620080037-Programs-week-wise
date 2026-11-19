public class Main {
    // Put each positive value x in position x - 1 when x is in [1, n].
    // O(n) time and O(1) extra space.
    static int firstMissingPositive(int[] nums) {
        int n = nums.length;
        int i = 0;

        while (i < n) {
            int value = nums[i];
            if (value >= 1 && value <= n && nums[value - 1] != value) {
                int temp = nums[i];
                nums[i] = nums[value - 1];
                nums[value - 1] = temp;
            } else {
                i++;
            }
        }

        for (int j = 0; j < n; j++) {
            if (nums[j] != j + 1) return j + 1;
        }
        return n + 1;
    }

    public static void main(String[] args) {
        int[] nums = {3, 4, -1, 1};
        System.out.println("Input: nums = [3, 4, -1, 1]");
        System.out.println("Output: " + firstMissingPositive(nums));
    }
}
