class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int left = 0;
        int right = height.length - 1;

        while(left < right){
            int hL = height[left];
            int hR = height[right];
            int width = right - left;
            int area;
            
            if(hL < hR){
                area = hL * width;
                left++;
            }
            else{
                area = hR * width;
                right--;
            }

            if(area > max) max = area;
        }

        return max;
    }
}