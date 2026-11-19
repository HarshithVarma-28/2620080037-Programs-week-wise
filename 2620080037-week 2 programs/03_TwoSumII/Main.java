import java.util.Arrays;

public class Main {
    // The input array is sorted, so two pointers solve this in O(n) time.
    static int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) return new int[]{left + 1, right + 1};
            if (sum < target) left++;
            else right--;
        }
        return new int[0]; // No solution case (not expected by LeetCode constraints).
    }

    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        System.out.println("Input: numbers = [2, 7, 11, 15], target = 9");
        System.out.println("Output: " + Arrays.toString(twoSum(numbers, target)));
    }
}
