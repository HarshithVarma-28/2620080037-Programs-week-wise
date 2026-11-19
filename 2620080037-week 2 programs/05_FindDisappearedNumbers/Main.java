import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Main {
    // Place each value x at index x - 1 whenever possible.
    // Runs in O(n) time and modifies the input array.
    static List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            } else {
                i++;
            }
        }

        List<Integer> missing = new ArrayList<>();
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) missing.add(j + 1);
        }
        return missing;
    }

    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println("Input: nums = [4, 3, 2, 7, 8, 2, 3, 1]");
        System.out.println("Output: " + findDisappearedNumbers(nums));
    }
}
