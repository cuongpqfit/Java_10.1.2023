
public class Student {

    // Attributes (private):
    //      Mã sinh viên là số nguyên.
    //      Họ tên: chuỗi ký tự.
    //      Điểm LT, điểm TH : float
    int mssv;
    String name;
    float diemLT, diemTH;

    // - Viết lớp Sinh viên như sau:
    
    // Constructor:
    //      Constructor mặc định (để khởi tạo đối tượng với các thông tin kiểu số là 0, kiểu chuỗi là
    //     chuỗi rỗng).
    public Student(){}
    //      Constructor thứ hai nhận đầy đủ thông tin để khởi tạo giá trị cho tất cả các biến instance.

    public Student(int mssv, String name, float diemLT, float diemTH) {
        this.mssv = mssv;
        this.name = name;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
    }
    //      Các getter và setter cho mỗi thuộc tính.

    public int getMssv() {
        return mssv;
    }

    public void setMssv(int mssv) {
        this.mssv = mssv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getDiemLT() {
        return diemLT;
    }

    public void setDiemLT(float diemLT) {
        this.diemLT = diemLT;
    }

    public float getDiemTH() {
        return diemTH;
    }

    public void setDiemTH(float diemTH) {
        this.diemTH = diemTH;
    }
    
    // Methods:
    //      Tính điểm trung bình.
    public float diemTB(){
        float diemTB = (diemLT + diemTH)/2;
        return diemTB;
    }
    //      Phương thức toString để diễn tả đối tượng ở dạng chuỗi.

    //Override
    // public String toString() {
    //     return "+ " + String.format("%06d",mssv) + " | " + name + "  |  " + diemLT + "   |   " + diemTH + "   |";
    // }
    
    public String toString() {

        return String.format("| "+"%06d"+" | "+"%-13s"+"|"+"%8.0f"+" |"+"%8.0f"+" |"+"%8.1f"+" |",mssv,name,diemLT,diemTH,diemTB()) ;
       
        }


    //     - Xây dựng class chứa hàm main: tạo 3 đối tượng sinh viên sv1, sv2, sv3, trong đó:
    
    //      sv1 chứa thông tin của chính mình (tạo bằng constructor đủ thông số, thông tin biết rồi khỏi nhập từ bàn phím).
    //      sv2 là thông tin người bạn thân nhất của em (tạo bằng constructor đủ thông số, thông tin biết rồi khỏi nhập từ bàn phím).
    //      sv3 tạo bằng constructor mặc định. Nhập các thông tin cho sv3 từ bàn phím rồi sau đó dùng các setter để gán vào cho các thuộc tính tương ứng.
    //      In bảng danh sách sinh viên gồm 4 cột là MSSV, họ tên, điểm LT, điểm TH, điểm TB(= (LT + TH)/2)
    //     (bảng có 3 dòng cho 3 sinh viên).
}
