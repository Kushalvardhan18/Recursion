public class SortedOrNot {
    public static int sortFunc(int nums[]){
        int n = nums.length;
        if(n==1){
            return n;
        }
        nums[0]<nums[1]+sortFunc(n-1);
    }
    public static void main(String[] args){
        int nums[] = {4,7,9,8,1,2};
        sortFunc(nums);
    }
}
