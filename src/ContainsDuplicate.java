/**
 * Created by WendyFan on 10/26/16.
 */
import java.util.HashMap;
public class ContainsDuplicate {
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,4,3};
        System.out.print(containsDuplicate(nums));
        return;
    }
    public static boolean containsDuplicate(int[] nums){
        if(nums == null || nums.length <= 1) return false;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int n : nums){
            if(map.containsKey(n)){
                map.put(n, map.get(n) + 1);
            }else{
                map.put(n, 1);
            }
        }
        for(int key : map.keySet()){
            if(map.get(key) != 1) return true;
        }
        return false;
    }
}