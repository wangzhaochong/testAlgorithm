import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Hayden on 2017/10/10.
 */
public class parseChar {


    public static void main(String [] s) throws UnsupportedEncodingException {

        String ss = "ab中文";
        byte[] bs = ss.getBytes("GBK");
        for(byte b : bs){
            System.out.print(b+" ");
        }

        System.out.println("\n===========================");


        char[] cs = ss.toCharArray();
        for(char c: cs){
            System.out.print(c + " ");
        }

        System.out.println("\n===========================");

    }


}
