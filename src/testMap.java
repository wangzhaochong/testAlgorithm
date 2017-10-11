import java.util.Hashtable;
import java.util.Map;

/**
 * Created by zhaochongwang on 2017/10/9.
 */
public class testMap {

    public static void main(String [] s){

        Map<String, String> test = new Hashtable<>();
        test.put("aa","bb");
        test.put("cc","dd");
        test.put("ee","ff");
        test.put("hh","jj");

        Thread cacheRefresh = new Thread(new Runnable() {
            @Override
            public void run() {
                test.remove("ee");
            }
        });
        cacheRefresh.setDaemon(true);



        for(Map.Entry entry : test.entrySet()){
            if(entry.getKey().equals("aa")){
                cacheRefresh.start();
            }
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

//        for(String k : test.keySet()){
//            if(k.equals("aa")){
//                cacheRefresh.start();
//            }
//            System.out.println(k + ":" + test.get(k));
//        }

//        if(test.get("ee") != null){
//            cacheRefresh.start();
//            System.out.println(test.get("ee"));
//        }

    }

}
