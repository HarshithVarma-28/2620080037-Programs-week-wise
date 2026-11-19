public class Main {
    // Answer is max(normal maximum, total sum - minimum subarray).
    // The all-negative case must be handled separately.
    static int maxSubarraySumCircular(int[] nums) {
        int total = 0;
        int currentMax = 0, bestMax = Integer.MIN_VALUE;
        int currentMin = 0, bestMin = Integer.MAX_VALUE;

        for (int value : nums) {
            currentMax = Math.max(value, currentMax + value);
            bestMax = Math.max(bestMax, currentMax);

            currentMin = Math.min(value, currentMin + value);
            bestMin = Math.min(bestMin, currentMin);

            total += value;
        }

        if (bestMax < 0) return bestMax;
        return Math.max(bestMax, total - bestMin);
    }

    public static void main(String[] args) {
        int[] nums = {1, -2, 3, -2};
        System.out.println("Input: nums = [1, -2, 3, -2]");
        System.out.println("Output: " + maxSubarraySumCircular(nums));
    }
}
