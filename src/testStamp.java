import java.util.*;

/**
 * Created by Hayden on 2017/10/10.
 * 邮票问题解法，参考：
 * https://wenku.baidu.com/view/5f7c7bf7daef5ef7ba0d3cf6.html
 */
public class testStamp {

    public static int [] stamps = {1,4,12,21};

    public static int maxCount = 5;
    public static int [] dp = new int [100];

    public static void main(String [] s){

        for(int i=0;i<dp.length;i+=1){
            dp[i]=-2;
        }

        int res = calcMaxCount(15);
        System.out.println("\n"+res);

        for (int aDp : dp) {
            System.out.print(aDp + " ");
        }



    }


    private static int calcMaxCount(int value) {


        if(value < 0){
            return -1;
        }

        if(dp[value-1] > 0){
            return dp[value-1];
        }

        for(int i=0; i<stamps.length; i+=1){
            if(value == stamps[i]){
                dp[value-1] = 1;
                return 1;
            }
        }


        int c0 = calcMaxCount(value-stamps[0]);
        int c1 = calcMaxCount(value-stamps[1]);
        int c2 = calcMaxCount(value-stamps[2]);
        int c3 = calcMaxCount(value-stamps[3]);
        int [] counts = {c0,c1,c2,c3};

        int index = -1;
        int minNum = Integer.MAX_VALUE;
        for(int i=0; i<counts.length;i+=1){
            if(counts[i] > 0 && minNum > counts[i]){
                minNum = counts[i];
                index = i;
            }
        }

        if(index >= 0 && minNum >= 0){
            dp[value-1] = minNum+1;
            return minNum+1;
        }else{
            dp[value-1] = -1;
            return -1;
        }


    }


}
