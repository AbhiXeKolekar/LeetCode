class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int left = 0;
        int right = height.length - 1;

        while(left < right){
            int hL = height[left];
            int hR = height[right];
            int area;
            
            if(hL < hR){
                area = hL * (right - left);
                left++;
            }
            else{
                area = hR * (right - left);
                right--;
            }

            if(area > max) max = area;
        }

        return max;
    }
}