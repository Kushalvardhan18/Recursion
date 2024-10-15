import java.util.ArrayList;

public class PracQues {
    public static ArrayList<Integer> findInd(int arr[], int key,int n){
        ArrayList<Integer> myList = new ArrayList<>();
        if(n<0){
            return myList;
        }
        if(key == arr[n]){
            myList.add(n);
        }
        myList.addAll(findInd(arr,2,n-1));
        return myList;
    }
    public static void main(String[] args){
        int[] arr ={3,2,4,5,6,2,7,2,2};
        System.out.println(findInd(arr,2,arr.length-1));
    }
}
