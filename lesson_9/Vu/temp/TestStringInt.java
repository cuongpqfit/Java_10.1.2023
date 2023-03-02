// package BT;

public class TestStringInt {
    
    public static void main(String[] agrs){
        int i = 10;

        // doi int sang String
        String s = String.valueOf(i);

        System.out.print(i+ " doi so");

        // kiem tra xem kieu du lieu cua bien so
        System.out.println(((Object)i).getClass().getSimpleName());
        System.out.println(((Object)s).getClass().getSimpleName());

}
}