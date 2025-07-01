//LeetCode 1838.Frequency of the most frequent element.

package Problems;
import java.util.Arrays;

public class LeetCode1838 {
    public static void main(String[] args) {
        int[] array = {1, 2, 4};
        int k = 5;
        System.out.println(maxFrequency(array, k));
    }
    static int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0;
        int right = 0;
        int sum = 0;
        int maxFrequency = 0;

        while (right < nums.length){
            sum += nums[right];
            while (nums[right] * (right - left + 1) - sum > k){
                sum -= nums[left];
                left++;
            }
            maxFrequency = Math.max(maxFrequency, right - left + 1);
            right++;
        }
        return maxFrequency;

    }
}
