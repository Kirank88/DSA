class Solution {
    public int findDuplicate(int[] nums) {

        //First Method

        // Arrays.sort(nums);
        // for(int i = 0; i<nums.length-1; i++) {
        //     if(nums[i]==nums[i+1]){
        //         return nums[i];
        //     }
        // }
        // return -1;

        //Second Method: Marking elements as visited,making it nagative
        int ans = -1;

        for (int i = 0; i<nums.length; i++) {
            int index = Math.abs(nums[i]);

            if(nums[index] < 0) {
               ans= index;
               break;
            }
            nums[index] *= -1;
        }
        return ans;

        //Third Method

    //     while (nums[0] != nums[nums[0]]) {
    //         int temp = nums[0];
    //         nums[0] = nums[nums[0]];
    //         nums[nums[0]] = temp;

    //     } return nums[0];
     }
}