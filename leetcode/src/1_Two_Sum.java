import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        
        if(nums.length == 0 && nums == null){
            return result;
        }
        
        HashMap<Integer, Integer> numsMap = new HashMap<>();
        for(int i=0; i < nums.length; i++){
            
            if(numsMap.containsKey(target - nums[i])){
                result[0] = numsMap.get(target - nums[i]);
                result[1] = i;
            } 
            
            numsMap.put(nums[i], i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] res = new Solution().twoSum(new int[]{1,2,3}, 2);
        for (int temp: res) {
            System.out.println(temp);
        }
    }
}