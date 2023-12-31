class Solution {
    public void moveZeroes(int[] nums) {
        int i =0;
        int j = i+ 1;
        int n = nums.length;
        while(i <n - 1 && j < n){
            if(nums[i] != 0){
                i++;
                j++;
            }else if( nums[i] == 0 && nums[j] == 0){
                j++;
            }else{
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
    }
}