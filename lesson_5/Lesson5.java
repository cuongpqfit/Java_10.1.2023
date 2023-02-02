import package1.Quare;

public class Lesson5 {

    public static void main(String[] args) {
        //Tạo Object Student
        Student svMinh = new Student(); // svMinh là Object từ class Student

        //Truy cap den thuoc tinh của object
        svMinh.name = "Pham Minh";

        //Truy cap den hành vi/phương thức của object
        svMinh.showName();


        Student svAn = new Student();
        svAn.name = "Tran Cong An";

        System.out.println("Toi ten là: " + svAn.getName());

        //Object private
        Quare quare1 = new Quare();
    }
}
