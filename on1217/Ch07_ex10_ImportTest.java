package on1217;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ch07_ex10_ImportTest {
    public static void main(String[] args) {
        Date today = new Date();

        SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd");
        SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");

        System.out.println(date.format(today));
        System.out.println(time.format(today));

    }
}
