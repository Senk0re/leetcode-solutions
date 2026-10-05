import java.util.HashMap;
import java.util.Arrays;

public class P1{
  public static void main(String[] args) {
    int[] nums = {2,7,11,15};
    int target = 9;
    
    System.out.println(Arrays.toString(twoSum(nums, target)));
  }
  
  public static int[] twoSum(int[] nums, int target) {
    HashMap<Integer,Integer> numMap = new HashMap<>();

    for(int i = 0; i < nums.length; i++) {
      int reminder = target - nums[i];
      
      if(numMap.containsKey(reminder)){
        return new int[] {numMap.get(reminder), i};
      }
      else {
        numMap.put(nums[i],i);
      }
    }
    return new int[] {};
  }
}
