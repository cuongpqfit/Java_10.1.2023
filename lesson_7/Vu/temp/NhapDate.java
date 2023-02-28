import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

// package temp;

public class NhapDate {
    String ngay;


    public NhapDate(String ngay) {
        this.ngay = ngay;

        try {
     
           SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
           Date date = format.parse(ngay);
           System.out.println(date);
     
         } catch (ParseException e) {
           e.printStackTrace();
   

    }

    
    @Override
    public String toString() {
    // Calendar cl = Calendar.getInstance();

    //     SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    //     String str2 = df.format(cl.getTime(ngay));
    
    return "NhapDate [ngay=" + ngay + "]";
    }


    public String getNgay() {
        return ngay;
    }

    public void setNgay(String ngay) {
        this.ngay = ngay;
        // this.ngay = ngay;
    }
    

}


}