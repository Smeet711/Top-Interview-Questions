class Solution {
    public int[] twoSum(int[] nums, int target) {
       int[] a = new int[]{-1,-1};
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    a[0]=i;
                    a[1]=j;
                    break;
                }
            }
        }
        return a;
        
        
        
        // optimal way
        
//         int[] res = new int[2];
        
//         Map<Integer,Integer> map = new HashMap<>();
//         for(int i=0;i<nums.length;i++){
//             if(map.containsKey(target - nums[i])){
//                 res[1] = i;
//                 res[0] = map.get(target - nums[i]);
//                 return res;
//             }
//             map.put(nums[i],i);
//         }
//         return res;
        
    }
}