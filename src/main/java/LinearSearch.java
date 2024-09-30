public class LinearSearch {
    public static void main(String[] args) {
        int nums[] = {1, 5, 6, 7, 8};
        int target = 5;
        int result = binarySearch(nums, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }

    private static int linearSearch(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        // Return -1 if the target is not found in the array
        return -1;
    }
    private  static  int binarySearch(int[] nums,int target){
        int left = 0;
        int right = nums.length-1;
        while(left <= right){
            int mid = (left+right)/2;
            if(nums[mid]== target){
                return mid;
            } else if(nums[mid]< target){
                left  = mid+1;

            } else{
                right = mid-1;
            }

        }
        return -1;
    }
}
