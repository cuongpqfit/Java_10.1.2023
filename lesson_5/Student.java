//CLASS Student trong Java
public class Student {

    //Khai báo thuộc tính của CLASS
    public String mssv;
    public String name;


    //Khai báo hành vi/phương thức của CLASS
    //void(Không cần trả về dữ liệu) là kiểu liệu trả về của hàm showName
    public void showName() {
        System.out.println("Ten cua toi la: " + name);
    }

    //String là kiểu dữ liệu trả về của phương thức getName
    public String getName() {
        //Nếu != void thì phải có retur;
        return name;
    }

    public String[] getName2() {
        //Nếu != void thì phải có retur;
        String[] a = {"a", "b"};
        return a ;
    }
}
