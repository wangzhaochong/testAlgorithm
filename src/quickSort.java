/**
 * Created by Hayden on 2017/10/10.
 */
public class quickSort {

    public static int [] array = {5,2,4,2,3,5,5,6,3,23,5,5,4,6,4,2};

    public static void main(String [] s){

        quickSort(0,array.length-1);


        for(int i : array){
            System.out.print(i + ",");
        }
        System.out.println("");

    }

    private static void quickSort(int start, int end) {

        if(end <= start) return;

        int sampleIndex = start;
        int sample = array[sampleIndex];
        for(int i=start+1; i<=end; i+=1){
            int value = array[i];
            if(value<sample){
                moveBeforerSample(i,sampleIndex);
                sampleIndex += 1;
            }
        }
        quickSort(start,sampleIndex-1);
        quickSort(sampleIndex+1,end);


    }

    private static void moveBeforerSample(int moveIndex, int sampleIndex) {

        int t=array[moveIndex];
        for(int i=moveIndex;i>sampleIndex;i-=1){
            array[i] = array[i-1];
        }
        array[sampleIndex] = t;

    }


    private static boolean isSorted() {
        for(int i=0;i<array.length-1;i+=1){
            if(array[i] > array[i+1]){
                return false;
            }
        }
        return true;
    }

    private static void changeValue(int i, int j) {
        int t = array[i];
        array[i] =  array[j];
        array[j] =  t;
    }




}
