public class _27_removeElement {
    public static int removeElement(int[] nums, int val) {
        int x = 0;
        for(int i = 0 ; i < nums.length; i++){
            if(nums[i] != val){
                nums[x++] = nums[i];
            }
        }
        return x;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        System.out.println(removeElement(nums,3));
    }
}
