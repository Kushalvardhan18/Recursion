public class FriendsPairingProblem {
    public static int pairProblem(int n){
        if(n==1 || n==2){
            return n;
        }
        int single = pairProblem(n-1);
        System.out.println(single);
        int pair = (n-1) *pairProblem(n-2);
        System.out.println(pair);
        int total = single + pair;
        return total;
    }
    public static void main(String[] args){
         int n =4;
        System.out.println(pairProblem(n));
    }
}
