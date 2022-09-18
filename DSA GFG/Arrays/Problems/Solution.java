class Solution {
    public int maxArea(int[] height) {
        int h = height.length;
        int area, maxarea = 0;
        int start = 0, end = h - 1;
        while (start < end) {
            area = Math.min(height[start], height[end]) * (end - start);
            maxarea = Math.max(maxarea, area);
            if (height[start + 1] > height[start]) {
                area = Math.min(height[start + 1], height[end]) * (end - (start + 1));
                if (area > maxarea) {
                    start++;
                    maxarea = Math.max(area, maxarea);
                }
            }
            if (height[end - 1] > height[end]) {
                area = Math.min(height[start], height[end - 1]) * (end - (start - 1));
                if (area > maxarea) {
                    end--;
                    maxarea = Math.max(area, maxarea);
                }
            }

        }
        return maxarea;

    }
}
