package PhucDV.BaiTapNangCao;

import java.util.Arrays;

//Leetcode : 2418-Sort the People

public class Bai2418 {
    public static void main(String[] args) {
        String[] names = {"IEO","Sgizfdfrims","QTASHKQ","Vk","RPJOFYZUBFSIYp","EPCFFt","VOYGWWNCf","WSpmqvb"};
        int[] heights = {17233,32521,14087,42738,46669,65662,43204,8224};
        System.out.println(Arrays.toString(sortPeople(names, heights)));
    }


    public static String[] sortPeople(String[] names, int[] heights) {
        for (int i = 1; i < heights.length; i++) {
            int j = i;
            while (j > 0 && heights[j - 1] < heights[j]) {
                int tmp = heights[j - 1];
                String tmpStr = names[j-1];
                heights[j - 1] = heights[j];
                names[j-1] = names[j];
                heights[j] = tmp;
                names[j] = tmpStr;
                j--;
            }
        }
        return names;
    }
}
