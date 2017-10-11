import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by zhaochongwang on 2017/10/9.
 */
public class ProductConsumerBlock {


    public static BlockingDeque<String> queue = new LinkedBlockingDeque<>();
    public static AtomicInteger count = new AtomicInteger(0);

    public static void main(String [] s){

        for(int i=0;i<3;i+=1){
            Thread prod = new Thread(new BlockProducer());
            prod.start();
        }

        for(int i=0;i<2;i+=1){
            Thread cons = new Thread(new BlockConsumer());
            cons.start();
        }

        while(true);

    }
}


class BlockProducer implements Runnable{

    @Override
    public void run() {
        try {
            while(ProductConsumerBlock.count.get()<100){
                ProductConsumerBlock.queue.put("goods"+ProductConsumerBlock.count.incrementAndGet());
                Thread.sleep(500L);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

class BlockConsumer implements Runnable{

    @Override
    public void run() {
        try {
            long start = System.currentTimeMillis();
            while(System.currentTimeMillis() - start < 60*1000){
                String res = ProductConsumerBlock.queue.take();
                System.out.println(res);
                Thread.sleep(200L);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

