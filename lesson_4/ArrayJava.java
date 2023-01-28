public class ArrayJava {
    public static void main(String[] args) {
        int a;
        int a1;
        int a2;
        int ak;

        int[] aArray = new int[4];


        //Mang 1 chieu
        String[] arrString = {"aaa", "bbb"}; // Java khơi tạo mảng 2 phần tử
        String[] arrString2 = new String[10]; // java sẽ khởi tạo mảng có 10; 0 -> 9;

        arrString2[0] = "ccc";
        arrString2[1] = "dđd";
        for(int i=0; i<arrString2.length; i++) {
            System.out.println(arrString2[i]);
        }

        //Mang 2 chieu
        int[][] array2d = {
                {1, 2},
                {3, 4}
        };

        for (int i=0; i<2; i++) {
            for(int j=0; j<2; j++) {
                System.out.print(array2d[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
