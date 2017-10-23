import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;

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

        ConcurrentHashMap<String,String> map = new ConcurrentHashMap<>();
        map.put("aa","aa");
        map.get("aa");

        map.entrySet().iterator();

        ReentrantLock reentrantLock = new ReentrantLock();


    }



}
