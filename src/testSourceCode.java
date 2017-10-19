import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by Hayden on 2017/10/10.
 */
public class testSourceCode {


    public static void main(String [] s){

        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        System.out.println(list.size());
        list.add("0");
        list.get(0);
        System.out.println(list.size());


    }



}
