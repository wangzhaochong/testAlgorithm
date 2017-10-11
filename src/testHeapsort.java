/**
 * Created by zhaochongwang on 2017/10/9.
 */
public class testHeapsort {

    public static int [] array = {21,342,23,32,32,65,74,3425,654,8,865,45745,332,3,4,213,32};

    public static void main(String [] s){

        heapsort(array.length);

        for (int i : array) {
            System.out.print(i + ",");
        }
        System.out.println("");


        printHeap(array.length);

        moveHeapTop();

        for (int i : array) {
            System.out.print(i + ",");
        }
        System.out.println("");

    }

    private static void moveHeapTop() {

        for(int i=array.length-1;i>0;i-=1){
            int t = array[0];
            array[0] = array[i];
            array[i] = t;
            adjustNode(0,i);
            printHeap(i);
        }

    }

    public static void heapsort(int length){

        for(int i=length;i>0;i-=1){
            if(i>0 && i%2 == 1){
                adjustNode((i-1)/2,length);
            }
        }
    }

    private static void adjustNode(int i,int length) {

        int childMax = 0;
        int childMaxIndex = -1;
        int leftIndex = i*2+1;
        if(length >= leftIndex+1){
            childMax = array[leftIndex];
            childMaxIndex = leftIndex;
        }
        if(length >= leftIndex+2 && childMax < array[leftIndex+1]){
            childMax = array[leftIndex+1];
            childMaxIndex = leftIndex+1;
        }
        if(childMax > 0 && childMaxIndex != -1 && array[i] < childMax){
            int t = array[i];
            array[i] = array[childMaxIndex];
            array[childMaxIndex] = t;
            adjustNode(childMaxIndex,length);
        }

    }


    private static void printHeap(int length) {

        for (int i=0;i<length;i++) {
            boolean eden = false;
            for(int j=1;j<=i+2;j*=2){
                if(i+2==j){
                    eden = true;
                }
            }
            if(eden){
                System.out.print(array[i] + "\n");
            }else{
                System.out.print(array[i] + ",");
            }

        }
        System.out.println("");

    }

}
