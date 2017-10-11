/**
 * Created by zhaochongwang on 2017/10/9.
 */
public class testStep {

    public static int [] dp = {0,0,0,0,0,0,0,0,0,0,0,0,};

    public static void main(String [] s){

        System.out.println(getStepCount(10));

    }

    public static int getStepCount(int n){

        if(dp[n] != 0) return dp[n];

        int res = 0;

        if(n == 1){
            res = 1;
        }else if(n == 2){
            res = 2;
        }else{
            res = getStepCount(n-1) + getStepCount(n-2);
        }


        dp[n] = res;
        return  res;
    }

}
