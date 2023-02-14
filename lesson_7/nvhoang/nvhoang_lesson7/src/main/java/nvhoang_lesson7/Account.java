package nvhoang_lesson7;


import java.text.NumberFormat;
public class Account {
    // Số tài khoản
    private long accountNumber;
    // Tên tài khoản
    private String accountName;
    // Số tiền trong tài khoản
    private double balance;
    // Lãi suất
    private static final double INTEREST_RATE = 0.035;

    // Constructor mặc định
    public Account() {
        this.accountNumber = 0;
        this.accountName = "";
        this.balance = 0;
    }

    // Constructor đầy đủ tham số
    public Account(long accountNumber, String accountName, double balance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = balance;
    }

    // Constructor có 2 đối số
    public Account(long accountNumber, String accountName) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = 50;
    }

    // Phương thức get, set cho từng thuộc tính
    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Phương thức toString
    public String toString() {
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
        return "Số tài khoản: " + getAccountNumber() + "\nTên tài khoản: " + getAccountName() + "\nSố tiền trong tài khoản: " + currencyFormat.format(getBalance());
    }

    // Phương thức nạp tiền
    public void deposit(double amount) {
        if (amount < 0) {
            System.out.println("Số tiền nạp không hợp lệ. Vui lòng nạp lại.");
        } else {
            setBalance(getBalance());
                }
    }
}

