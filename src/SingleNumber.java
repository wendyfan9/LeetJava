/**
 * Created by Wendy on 10/26/2016.
 */
import java.util.*;
public class SingleNumber {
    public static void main(String[] args){
        int[] nums = {1,1,2,3,3,4,4,2,5};
        System.out.print(singleNumber(nums));
        return;
    }
    public static int singleNumber(int[] nums){
        if(nums == null || nums.length== 0){
            return -1;
        }
        HashSet<Integer> set = new HashSet<Integer>();
        for(int n: nums){
            if(set.contains(n)){
                set.remove(n);
            }else {
                set.add(n);
            }
        }
        return set.toArray(new Integer[0])[0];
    }
}
