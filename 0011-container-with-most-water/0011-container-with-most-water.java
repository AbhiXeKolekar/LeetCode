class Solution {
    public int maxArea(int[] height) {
        int left = 0; 
        int right = height.length - 1;
        int max = Integer.MIN_VALUE;

        while(left < right){
            int min = Math.min(height[left], height[right]);
            int contains = (right - left) * min;

            if(contains > max) max = contains;

            if(height[left] < height[right]) left++;
            else right--;
        }

        return max;
    }
}