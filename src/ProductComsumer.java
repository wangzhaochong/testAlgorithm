import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by zhaochongwang on 2017/10/9.
 */
public class ProductComsumer {

    public static Queue<String> queue = new ConcurrentLinkedDeque<>();
    public static AtomicInteger count = new AtomicInteger(0);

    public static void main(String [] s){

        for(int i=0;i<3;i+=1){
            Thread prod = new Thread(new Producer());
            prod.start();
        }

        for(int i=0;i<2;i+=1){
            Thread cons = new Thread(new Consumer());
            cons.start();
        }

        while(true);

    }

}

class Producer implements Runnable{

    @Override
    public void run() {
        try {
            while(ProductComsumer.count.get()<100){
                ProductComsumer.queue.offer("goods"+ProductComsumer.count.incrementAndGet());
                Thread.sleep(500L);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

class Consumer implements Runnable{

    @Override
    public void run() {
        try {
            long start = System.currentTimeMillis();
            while(System.currentTimeMillis() - start < 60*1000){
                synchronized (ProductComsumer.queue){
                    if(!ProductComsumer.queue.isEmpty()){
                        String res = ProductComsumer.queue.poll();
                        System.out.println(res);
                    }
                }
                Thread.sleep(200L);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
