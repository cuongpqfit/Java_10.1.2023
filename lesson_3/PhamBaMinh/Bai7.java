package PhamBaMinh;

public class Bai7 {
    //2011. Final Value of Variable After Performing Operations
    public  static int finalValueAfterOperations(String[] operations) {
        int n=0;
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].charAt(1)=='+'){
                n++;
            }
            else {
                n--;
            }

        }
        return n;
    }

    public static void main(String[] args) {
        String[] operations ={"--X","X++","X++"};
        System.out.println(finalValueAfterOperations(operations));
    }

}
