public class BinaryStringProblem {
    public static void printBinstrings(int n, int lastPlace,String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        printBinstrings(n-1,0,str+"0");
        if(lastPlace == 0){
            printBinstrings(n-1,1,str+"1");
        }
    }
    public static void main(String[] args){
        int n=3;
        printBinstrings(n,0,"");
    }
}
