public class FirstOccurence {
    public static int firstOccurIndex(int nums[],int key,int i){
        int n = nums.length;
        if(i==n-1 ){
            return -1;
        }
        if(nums[i] == key){
            return i;
        }

          return  firstOccurIndex(nums,key,i+1);


    }
    public static void main(String[] args){
        int nums[] ={8,3,6,5,9,10,5,2,3};
        int key =5;
        int i=0;
        System.out.println(firstOccurIndex(nums,key,i));
    }
}
