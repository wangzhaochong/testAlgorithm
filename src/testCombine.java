/**
 * Created by zhaochongwang on 2017/10/9.
 */
public class testCombine {

    public static int [] array = {21,342,23,32,32,65,74,3425,654,8,865,45745,332,3,4,213,32};

    public static void main(String [] s){


        combineSort();

        for (int i : array) {
            System.out.print(i + ",");
        }
        System.out.println("");


        insertSort(0,array.length-1);

        for (int i : array) {
            System.out.print(i + ",");
        }
        System.out.println("");


    }

    private static void combineSort() {

        for(int i=2;i<array.length*2;i*=2){
            for(int j=0;j<array.length;j+=i){
                int end = j+i;
                if(end > array.length){
                    end = array.length;
                }
                insertSort(j,end-1);
            }
        }

    }

    private static void insertSort(int start, int end) {

        for(int i=start+1;i<=end;i+=1){
            if(array[i] < array[i-1]){
                int t = array[i];
                for(int j=i-1;j>=start;j-=1){
                    if(array[j] > t){
                        array[j+1] = array[j];
                    }else{
                        array[j+1] = t;
                        break;
                    }
                }
                if(array[start]>t){
                    array[start] = t;
                }
            }
        }

    }


}
