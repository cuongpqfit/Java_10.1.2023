// package Vu;

public class Bai62 {
    public static void main ( String[] args){
        // - Xây dựng class chứa hàm main: tạo 3 đối tượng sinh viên sv1, sv2, sv3, trong đó:
        //  sv1 chứa thông tin của chính mình (tạo bằng constructor đủ thông số, thông tin biết rồi khỏi nhập từ bàn phím).
        //  sv2 là thông tin người bạn thân nhất của em (tạo bằng constructor đủ thông số, thông tin biết rồi khỏi nhập từ bàn phím).
        //  sv3 tạo bằng constructor mặc định. Nhập các thông tin cho sv3 từ bàn phím rồi sau đó dùng các setter để gán vào cho các thuộc tính tương ứng.
        //  In bảng danh sách sinh viên gồm 4 cột là MSSV, họ tên, điểm LT, điểm TH, điểm TB(= (LT + TH)/2)
        // (bảng có 3 dòng cho 3 sinh viên).
        // +--------+--------------+---------+---------+---------+
        // |  MSSV  |    họ tên    | điểm LT | điểm TH | điểm TB |
        // +--------+--------------+---------+---------+---------+
        // | 000001 | Nguyễn Văn A |      10 |       8 |       9 |
        // | 000002 | Nguyễn Văn B |       9 |       8 |     8.5 |
        // | 000003 | Nguyễn Văn C |       9 |       9 |       9 |
        // +--------+--------------+---------+---------+---------+

        Student sv1 = new Student(00001, "Nguyen Van A", 10, 8);
        Student sv2 = new Student(00002, "Nguyen Van B", 9, 8);
        Student sv3 = new Student();

        //nhap thong tin sv3
        sv3.setMssv(3);
        sv3.setName("Nguyen Van C");
        sv3.setDiemLT(9);
        sv3.setDiemTH(9);

        //xuat thong tin

        System.out.println("+--------+--------------+---------+---------+---------+");
        System.out.println("|  MSSV  |     ho ten   | diem LT | diem TH | diem TB |");
        System.out.println("+--------+--------------+---------+---------+---------+");

        //xuat thong tin sv1 bang lenh printf
        System.out.printf("| "+"%06d"+" | "+"%-13s"+"|"+"%8.0f"+" |"+"%8.0f"+" |"+"%8.1f"+" |",sv1.mssv,sv1.name,sv1.diemLT,sv1.diemTH,sv1.diemTB());
       
        //xuat thong tin sv2
        System.out.println("\n"+sv2);
        
        //xuat thong tin sv3
        System.out.println(sv3);
        System.out.println("+--------+--------------+---------+---------+---------+");

    }
}
