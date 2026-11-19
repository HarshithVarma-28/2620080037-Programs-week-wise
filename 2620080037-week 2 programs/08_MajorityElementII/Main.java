import java.util.ArrayList;
import java.util.List;

public class Main {
    // At most two values can occur more than floor(n / 3) times.
    // Extended Boyer-Moore followed by a verification pass.
    static List<Integer> majorityElement(int[] nums) {
        int candidate1 = 0, candidate2 = 1;
        int count1 = 0, count2 = 0;

        for (int value : nums) {
            if (value == candidate1) count1++;
            else if (value == candidate2) count2++;
            else if (count1 == 0) { candidate1 = value; count1 = 1; }
            else if (count2 == 0) { candidate2 = value; count2 = 1; }
            else { count1--; count2--; }
        }

        count1 = 0;
        count2 = 0;
        for (int value : nums) {
            if (value == candidate1) count1++;
            else if (value == candidate2) count2++;
        }

        List<Integer> result = new ArrayList<>();
        if (count1 > nums.length / 3) result.add(candidate1);
        if (count2 > nums.length / 3) result.add(candidate2);
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        System.out.println("Input: nums = [3, 2, 3]");
        System.out.println("Output: " + majorityElement(nums));
    }
}
