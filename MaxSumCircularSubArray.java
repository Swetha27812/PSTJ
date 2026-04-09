package Tasks;

public class MaxSumCircularSubArray {

	

	    public int maxSubarraySumCircular(int[] nums) {
	        int totalSum = 0;
	        int maxSum = nums[0];
	        int currentMax = 0;
	        int minSum = nums[0];
	        int currentMin = 0;

	        for (int num : nums) {
	            totalSum += num;

	           
	            currentMax = Math.max(num, currentMax + num);
	            maxSum = Math.max(maxSum, currentMax);

	            
	            currentMin = Math.min(num, currentMin + num);
	            minSum = Math.min(minSum, currentMin);
	        }

	     
	      
	        if (maxSum < 0) {
	            return maxSum;
	        }

	     
	        return Math.max(maxSum, totalSum - minSum);
	    }

	    public static void main(String[] args) {
	        MaxSumCircularSubArray solution = new MaxSumCircularSubArray();

	        // Test Case 1: Standard Kadane
	        int[] nums1 = {1, -2, 3, -2};
	        System.out.println("Test 1 Result: " + solution.maxSubarraySumCircular(nums1)); // Expected: 3

	        // Test Case 2: Circular is better
	        int[] nums2 = {5, -3, 5};
	        System.out.println("Test 2 Result: " + solution.maxSubarraySumCircular(nums2)); // Expected: 10

	        // Test Case 3: All negative numbers
	        int[] nums3 = {-3, -2, -3};
	        System.out.println("Test 3 Result: " + solution.maxSubarraySumCircular(nums3)); // Expected: -2
	    }
	}
