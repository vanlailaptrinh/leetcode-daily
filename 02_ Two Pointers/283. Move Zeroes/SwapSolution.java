public class SwapSolution {
        public void moveZeroes(int[] nums) {
        int write = 0;
        for (int i = 0; i < nums.length; i++){
            if(nums[i]!= 0){
                int temp = nums[i];
                nums[i] = nums[write];
                nums[write] = temp;

                write++;
            }
        }
    }
}
