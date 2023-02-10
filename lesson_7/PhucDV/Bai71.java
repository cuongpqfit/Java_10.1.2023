package PhucDV;

public class Bai71 {
    public static void main(String[] args) {
        Account account1 = new Account(2121996822, "DAM VAN PHUC",68000000);
        Account account2 = new Account(1211199782, "NGUYEN VAN A",22000000);

        System.out.println(account1);
        System.out.println(account2);

        account1.napTien();
        account1.rutTien();
        account1.daoHan();
        account1.chuyenTien(account2);
    }
}


