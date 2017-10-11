import java.util.Random;

/**
 * Created by Hayden on 2017/10/10.
 */
public class pokerRandom {

    public static int [] array = new int[52];

    public static void main(String [] s){

        for(int i=0;i<array.length;i+=1){
            array[i] = i+1;
        }

        randomPoker();

        for(int i : array){
            System.out.print(i+" ");
        }
        System.out.println(" ");

    }

    private static void randomPoker() {

        Random random = new Random(System.currentTimeMillis());
        for(int i=0;i<array.length;i+=1){
            int t = array[i];
            int index = random.nextInt(52);
            array[i] = array[index];
            array[index] = t;
        }


    }


}
