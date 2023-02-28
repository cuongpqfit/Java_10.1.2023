public class BtLC2418 {

    public static  String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;
        int last, j;

        for (int i = 1; i < n; i ++)  {
            last = heights[i];
            String temp;
            j = i;
            while ( j > 0 && heights[j-1]< heights[j]){
                    temp  = names[j];
                    names[j] = names [j-1];
                    names [j-1] = temp;

                    j= j-1;
                    }

                }
                return names;
            }
            // 6       5     7     4     2     1     3     8 
            // "A",   "B",  "C",  "D",  "E",  "F",  "G",  "H"
            // 17233,32521,14087,42738,46669,65662,43204,8224}
/*
 * int last, j;
        int tmp;
        for (int i=1; i<n; i++) {
            last = A[i];
            j = i;

            //duyet cac phan tử trước i để đưa giá trị A[i] về đúng vị trí
            while ((j>0) && (A[j-1] > last)) {

                //Đổi chỗ 2 phần tử
                tmp = A[j];
                A[j] = A[j-1];
                A[j-1] = tmp;
                j = j - 1;
 */
    
    public static void main( String [] agrs){
        // String [] names= {"A", "B", "C"};
        // int [] heights= {120, 180, 145};
        // String [] names= {"Alice","Bob","Bob"};
        // int [] heights= {155,185,150};

        String [] names= {"A","B","C","D","E","F","G","H"};
        int [] heights= {17233,32521,14087,42738,46669,65662,43204,8224};
         sortPeople(names, heights);
        
        for (String i : names)
        System.out.print(i+ " ");

    }
}
