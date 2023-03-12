public class TEST {
    public static void main(String[] args) {
        String [] str = {"mo t", " hai", "ba voi bon","nam "};
        int count = 0;
        for (String str1: str) {
            for (int j= 0; j < str1.length() ; j++) {
                if(str1.charAt(j) == ' ' ){
                    count ++;
                }
            }
        }
        System.out.println(count);
    }
}