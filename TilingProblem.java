public class TilingProblem {
    public static int solution(int n){
        if(n==0 || n==1){
            return 1;
        }
        //kaam
        //vertical choice
        int verticalTiles = solution(n-1);

        // horizontal choice
        int horizontalChoice = solution(n-2);

        int totalWays = verticalTiles + horizontalChoice;
        return totalWays;
    }
    public static void main(String[] args){
        System.out.println(solution(10));
    }
}
