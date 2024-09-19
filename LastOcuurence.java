public class LastOcuurence {
    public static int IndexOfLastOccur(int[ ] nums,int key,int i){
       if(i== nums.length){
           return -1;
       }
        int isFound = IndexOfLastOccur(nums,key,i+1);
       if(isFound == -1 && nums[i] == key){
           return i;
       }

        return isFound;
    }
    public static void main(String[] args){
        int nums[] ={8,3,6,5,9,10,5,5,2,3};
        int key =5;
        int i=0;
        System.out.println(IndexOfLastOccur(nums,key,i));
    }
}
