class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int left = 0;
        int right = height.length - 1;

        while(left < right){
            int hL = height[left];
            int hR = height[right];

            int width = right - left;
            int min;

            if(hL < hR){
                min = hL;
                left++;
            }
            else{
                min = hR;
                right--;
            }
            int area = width * min;

            if(area > max) max = area;
        }

        return max;
    }
}