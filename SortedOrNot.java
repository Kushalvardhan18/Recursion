public class SortedOrNot {
    public static boolean sortFunc(int nums[],int i){
       if(i== nums.length-1){
           return true;
       }
        if(nums[i]>nums[i+1]){
           return false;
       }
      return sortFunc(nums,i+1);
    }
    public static void main(String[] args){
        int nums[] = {4,7,8};
        int i=0;
        System.out.println(sortFunc(nums,i));
    }
}
