import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by zhaochongwang on 2017/10/9.
 */
public class testSubArray {

    public static void main(String [] s){


        int [] array = {2,3,2,1,5,4,5,6,73,4,6,4,3};

        List<Integer> res = getMaxArray(array);
        System.out.println(res);

    }

    private static List<Integer> getMaxArray(int[] array) {

        List<Stack<Integer>> subArrays = new ArrayList<>();
        for(int n : array){
            int min = n;
            Stack<Integer> minStack = null;
            for(Stack<Integer> stack : subArrays){
                if(stack != null && stack.size() > 0){
                    int top = stack.peek();
                    if(n > top && n - top < min){
                        min = n - top;
                        minStack = stack;
                    }
                }
            }
            if(minStack == null){
                minStack = new Stack<>();
                subArrays.add(minStack);
            }
            minStack.push(n);
        }
        int max = 0;
        Stack maxStack = null;
        for(Stack<Integer> stack : subArrays){
            if(stack.size() > max){
                max = stack.size();
                maxStack = stack;
            }
        }
        System.out.println(subArrays);

        List<Integer> res = new ArrayList<>();
        res.addAll(maxStack);

        return res;

    }

}
