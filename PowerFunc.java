public class PowerFunc {
    public static int powFn(int x,int n){
        if(n==0){
            return 1;
        }
        return x*powFn(x, n-1);
    }
    public static int optimisedPowFn(int x, int n){
        if(n==0){
            return 1;
        }
//       int halfPowerSq=  optimisedPowFn(x,n/2) * optimisedPowFn(x,n/2);
       int halfPower=  optimisedPowFn(x,n/2) ;
        int halfPowerSq = halfPower *halfPower;

        // n is odd
        if(n%2 != 0){
            halfPowerSq = x*halfPowerSq;
        }
        return halfPowerSq;
    }
public static void main(String[] args){
    int x=2;
    int n=11;
    System.out.println(powFn(x, n));
    System.out.println(optimisedPowFn(x, n));
}
}