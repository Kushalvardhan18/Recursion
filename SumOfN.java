public class SumOfN {
    public static int sumOfN(int n){
        if(n==1){
            return 1;
        }
        int sum =0;
        sum += n + sumOfN(n-1);
        return sum;
    }
    public static void main(String[] args){
        int n =5;
        System.out.println(sumOfN(n));
    }
}
