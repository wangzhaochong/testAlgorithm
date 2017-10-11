
/**
 * Created by Hayden on 2017/10/10.
 */
public class binSearch {

    public static int [] array = {1,2,2,2,3,3,4,4,4,5,5,5,5,6,6,23};

    public static void main(String [] s){

        int target = 23;
        System.out.println(binSearchTarget(target,0,array.length));
        if(binSearchTarget(target,0,array.length) > 0){
            System.out.println(array[binSearchTarget(target,0,array.length)]);
        }

    }

    private static int binSearchTarget(int target,int start,int end) {

        if(start > end){
            return -1;
        }

        int mid = (start+end)/2;
        if(array[mid] < target){
            start = mid +1;
        }else if(array[mid] > target){
            end = mid - 1;
        }else if(array[mid] == target){
            return mid;
        }
        return binSearchTarget(target, start, end);

    }


}
