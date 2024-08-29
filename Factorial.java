public class Factorial {
    public static int numFact(int n){
        if(n==0){
            return 1;
        }
        int fact  = n *numFact(n-1);
        return fact;
    }
    public static void main(String[] args){
        int n =6;
       System.out.println(numFact(n));
    }
}
