public class JavaType {
    String name2 = "Pham Quoc Cuong"; //Biến instance -> vì khai trong class;

    public static void main(String[] args) {
        final int NAME = 10; //Hằng số -> Không thay đổi dược giá trị
        final String NAME_PERSON = "Pham Quoc Cuong";

        int name = 11; //Biến local vi o trong 1 function main();
        System.out.println(name);

        name = 12;
        System.out.println(name);

        System.out.println(NAME);
        System.out.println(NAME_PERSON);

        //Ep kieu trong Java
        int a = 10;
        int b = 3;

        System.out.println("a:b = " + (float)a/b);
    }
}