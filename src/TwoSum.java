/**
 * Created by wendy on 10/26/2016.
 */
import java.util.*;
public class TwoSum {
    public static void main(String[] args){
        int[] nums = {1,23,2,3,4,5,6};
        int target = 29;
        int[] result = twoSum(nums, target);
        for(int n : result){
            System.out.println(n);
        }
        return;
    }
    public static int[] twoSum(int[] nums, int target){
        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                result[0] = map.get(nums[i]);
                result[1] = i;
                break;
            }else{
                map.put(target - nums[i], i);
            }
        }
        return result;
    }
}
//O(n) space, O(n) time;