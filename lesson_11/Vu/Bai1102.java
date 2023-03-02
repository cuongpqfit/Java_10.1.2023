public class Bai1102 {
    public static void main (String[]agrs){
        //doc du lieu tu file number1.txt
       try{ 
        SecondThread td1 = new SecondThread();
        Thread thread1 = new Thread(td1);  

        thread1.start();

   
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
/*Bài 2. Viết chương trình Java khác để thực hiện công việc:
Sử dụng 3 threads:
    - Thread 1 sau mỗi giây sẽ đọc dữ liệu là một số trong file "number.txt" sau giá trị n đầu tiên
        Nếu số đọc được là chẵn thì chuyển qua thread 2
        Nếu số đọc được là lẻ thì chuyển qua thread 3
    - Thread 2:
        Ngay sau khi nhận được số vừa đọc từ thread 1 thì nó sẽ in ra file "output2.txt" tất cả các ước số của số này
        Ví dụ:  Thread -2:  18 = 1, 2, 3, 6, 9, 18
    - Thread 3:
        Ngay sau khi nhận được số vừa đọc từ thread 1 thì nó sẽ in ra file "output3.txt" là bình phương của số đó
        Ví dụ:  Thread -3:  9 = 91
    - Đồng bộ thread 2 và Thread 3 (dùng synchronized) ghi kết quả ra file "output4.txt" trong đó kết quả Thread-3 ghi
    trước Thread-2
    Ví dụ:
number.txt      output2.txt                     output3.txt                 output4.txt
2 3 4           Thread -2:  2 = 1, 2            Thread -3:  2 = 4           Thread -3:  2 = 4
                Thread -2:  3 = 1, 3            Thread -3:  3 = 9           Thread -3:  3 = 9
                Thread -2:  4 = 1, 2, 4         Thread -3:  4 = 16          Thread -3:  4 = 16
                                                                            Thread -2:  2 = 1, 2
                                                                            Thread -2:  3 = 1, 3
                                                                            Thread -2:  4 = 1, 2, 4
 */