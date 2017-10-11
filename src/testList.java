import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by zhaochongwang on 2017/10/9.
 */
public class testList {

    public static void main(String [] s){

        List<String> test = new CopyOnWriteArrayList<>();

        test.add("aa");
        test.add("bb");
        test.add("cc");
        test.add("dd");

        Thread cacheRefresh = new Thread(new Runnable() {
            @Override
            public void run() {
                test.remove("cc");
            }
        });
        cacheRefresh.setDaemon(true);



//        for(String v : test){
//            if(v.equals("aa")){
//                cacheRefresh.start();
//            }
//            System.out.println(v);
//        }

//        Iterator it = test.iterator();
//        while(it.hasNext()){
//            String v = (String) it.next();
//            if(v.equals("aa")){
//                cacheRefresh.start();
//            }
//            if(v.equals("cc")){
//                test.remove("cc");
//            }
//            if(v.equals("dd")){
//                System.out.println(v);
//            }
//        }

        for(String v : test){
            if(v.equals("cc")){
                test.remove("cc");
            }
            if(v.equals("dd")){
                System.out.println(v);
            }
        }

        for(String v : test){
            System.out.println(v);
        }



    }

}
