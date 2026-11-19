import java.util.Scanner;

public class Main {
    // Returns floor(sqrt(x)) without using floating-point arithmetic.
    static int mySqrt(int x) {
        int low = 0, high = x, answer = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Use division to avoid overflow from mid * mid.
            if (mid == 0 || mid <= x / mid) {
                answer = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int x = 8;
        System.out.println("Input: x = " + x);
        System.out.println("Output: " + mySqrt(x));
    }
}
