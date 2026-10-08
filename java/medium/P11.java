public class P11 {
    public static void main(String[] args) {
        int[] heights = {1,7,2,5,4,7,3,6};
        System.out.println(maxArea(heights));
    }

    public static int maxArea(int[] heights) {
        int max_area = 0;
        int left = 0;
        int right = heights.length - 1;

        while (left < right) {
            int height = (heights[left] < heights[right]) ? heights[left] : heights[right];
            int width = right - left;
            int area = height * width;

            if(height * width > max_area) {
                max_area = height * width;
            }

            if(heights[left] <= heights[right]) {
                left++;
            } else{
                right--;
            }
        }
        return max_area;
    }
}
