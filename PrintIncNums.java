public class PrintIncNums {
    public static void IncNums(int n){
        if(n==10){
            System.out.println(n);
            return;
        }
        else{
            System.out.println(n+" ");
            IncNums(n+1);
        }
    }
    public static void main(String[] args){
        int n =1;
        IncNums(n);
    }
}
