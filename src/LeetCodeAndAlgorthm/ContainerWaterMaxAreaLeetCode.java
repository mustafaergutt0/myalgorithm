package LeetCodeAndAlgorthm;

public class ContainerWaterMaxAreaLeetCode {

        public static int maxArea(int[] height) {
            int left = 0;            // Start with left pointer at the beginning
            int right = height.length - 1;  // Right pointer at the end
            int maxArea = 0;

            // Loop until the two pointers meet
            while (left < right) {
                // Calculate the area with the current left and right lines
                int currentArea = Math.min(height[left], height[right]) * (right - left);
                // Update the maximum area found so far
                maxArea = Math.max(maxArea, currentArea);

                // Move the pointer pointing to the shorter line
                if (height[left] < height[right]) {
                    left++;  // Move the left pointer right
                } else {
                    right--; // Move the right pointer left
                }
            }

            return maxArea;  // Return the maximum area found
        }

        public static void main(String[] args) {
            int[] height = {1,8,6,2,5,4,8,3,7};
            System.out.println("Maximum area: " + maxArea(height));  // Output: 49
        }
    }


