import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Hayden on 2017/10/10.
 */
public class tesFanxing {


    public static void main(String [] s){

        tesFanxing tf = new tesFanxing();

        Parent parent = new Parent();
        Child child = new Child();
        tf.<Parent>testPrintT(child);

    }

    public <T> void testPrintT(T t){
        System.out.println(t);
    }


}

class Parent{
    public String toString(){
        return "parent";
    }
}


class Child extends Parent{
    public String toString(){
        return "child";
    }
}
