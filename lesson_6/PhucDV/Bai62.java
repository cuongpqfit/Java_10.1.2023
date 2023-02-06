package PhucDV;

import java.util.Scanner;

public class Bai62 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student SV1 = new Student(0001, "Dam Van Phuc",8,8);
        Student SV2 = new Student(0002, "Nguyen Van Bi",9,8);
        Student SV3 = new Student();

        System.out.println("Nhap ma so sinh vien : ");
        int maSV = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap ho ten sinh vien : ");
        String tenSV = scanner.nextLine();
        System.out.println("Nhap diem li thuyet : ");
        float diemLT = scanner.nextFloat();
        System.out.println("Nhap diem thuc hanh : ");
        float diemTH = scanner.nextFloat();

        SV3.setMaSV(maSV);
        SV3.setTenSV(tenSV);
        SV3.setDiemLT(diemLT);
        SV3.setDiemTH(diemTH);

        float diemTBSV1 = SV1.tinhTB();
        float diemTBSV2 = SV2.tinhTB();
        float diemTBSV3 = SV3.tinhTB();

        System.out.println( "+-----+---------------------+--------+--------+--------+");
        System.out.printf("|%-5s| %-20s|%8s|%8s|%8s|","MSSV","       Họ tên","Điểm LT","Điểm TH", "Điểm TB");
        System.out.println();
        System.out.println( "+-----+---------------------+--------+--------+--------+");
        show(SV1,diemTBSV1);
        show(SV2,diemTBSV2);
        show(SV3,diemTBSV3);
        System.out.println( "+-----+---------------------+--------+--------+--------+");

    }
    public static void show(Student SV , float diemTB){
        System.out.printf("|  %-3d| %-20s|%8.2f|%8.2f|%8.2f|",SV.getMaSV(),SV.getTenSV(),SV.getDiemLT(),SV.getDiemTH(),diemTB);
        System.out.println();
    }
}
