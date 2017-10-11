/**
 * Created by Hayden on 2017/10/10.
 */
public class bubbleSort {

    public static int [] array = {1,2,4,2,3,5,5,6,3,23,5,5,4,6,4,2};

    public static void main(String [] s){

        bobblesort();
        for(int i : array){
            System.out.print(i + ",");
        }
        System.out.println("");

    }

    private static void bobblesort() {

        for(int i=array.length; i>1; i-=1){
            for(int j=0; j<i-1;j+=1){
                if(array[j] > array[j+1]){
                    changeValue(j, j+1);
                }
            }
            if(isSorted()){
                break;
            }
        }

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
