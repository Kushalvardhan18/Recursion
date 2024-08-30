public class FibonacciNum {
    public static int fibNum(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        int fnm1= fibNum(n-1);
        int fnm2= fibNum(n-2);
        int fn = fnm1+fnm2;
        return fn;
    }
    public static void main(String[] args){
        int n =5;
       System.out.print(fibNum(n));
    }
}
