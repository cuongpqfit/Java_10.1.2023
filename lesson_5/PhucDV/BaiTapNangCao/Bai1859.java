package PhucDV.BaiTapNangCao;

//Leetcode : 1859-Sorting the Sentence

public class Bai1859 {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        System.out.println(sortSentence(s));
    }

    public static String sortSentence(String s) {
    StringBuilder stringBuilder = new StringBuilder();
    String[] str = s.split("\\s++");
    String [] tmp = new String[str.length];
        for (int i = 0; i < str.length; i++) {
            char [] tmpChar = str[i].toCharArray();
            String tmp1 = str[i].substring(0,tmpChar.length - 1);
            tmp[Integer.parseInt(String.valueOf(tmpChar[tmpChar.length - 1])) - 1] = tmp1;
        }
        for (int i = 0; i < tmp.length; i++) {
            stringBuilder.append(tmp[i]);
            stringBuilder.append(" ");
        }
        return stringBuilder.toString().trim();
    }
}
