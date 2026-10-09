import java.util.Arrays;
public class P42 {
    public static void main() {
        int[] height = {0,2,0,3,1,0,1,3,2,1};
        System.out.println(trap(height));
    }

    public static int trap(int[] height) {
        int len = height.length;

        if (len == 0) return 0;

        int[] maxLeft = new int[len];
        maxLeft[0] = height[0];
        int[] maxRight = new int[len];
        maxRight[len-1] = height[len-1];
        
        for (int i = 1; i < len; i++) {
            int max = (maxLeft[i-1] > height[i]) ? maxLeft[i-1] : height[i];
            maxLeft[i] = max;
        }
        for (int i = len - 2; i >= 0; i--) {
            int max = (maxRight[i+1] > height[i]) ? maxRight[i+1] : height[i];
            maxRight[i] = max;
        }
        
        int water = 0;
        for (int i = 0; i < len; i++) {
            int min = (maxLeft[i] < maxRight[i]) ? maxLeft[i] : maxRight[i];
            water += min - height[i];
        }

        return water;
    }
}
