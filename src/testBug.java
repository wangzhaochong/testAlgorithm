/**
 * Created by zhaochongwang on 2017/10/9.
 */
public class testBug {

    public static int [] weight = {7,3,4,5};
    public static int [] value = {42,12,40,25};

    public static int [][] dp = new int[8][4];

    public static void main(String [] s){

        for(int i=0; i<8; i+=1){
            for(int j=0; j<4; j+=1){
                dp[i][j] = 0;
            }
        }

        int maxValue = getBugContent(8,4);
        System.out.println(maxValue);

        for(int i=0; i<8; i+=1){
            for(int j=0; j<4; j+=1){
                System.out.print(dp[i][j] + ",");
            }
            System.out.print("\n");
        }


    }

    private static int getBugContent(int maxWeight,int goodsCount) {


        if(goodsCount == 0){
            return 0;
        }
        if(maxWeight == 0){
            return 0;
        }

        if(dp[maxWeight-1][goodsCount-1] > 0)
            return dp[maxWeight-1][goodsCount-1];

        if(maxWeight - weight[goodsCount-1] < 0){
            return getBugContent(maxWeight, goodsCount-1);
        }
        int weightNotPutCurrent = getBugContent(maxWeight, goodsCount-1);
        int weightPutCurrent = getBugContent(maxWeight - weight[goodsCount-1], goodsCount-1) + value[goodsCount - 1];
        int res = weightNotPutCurrent > weightPutCurrent ? weightNotPutCurrent : weightPutCurrent;

        dp[maxWeight-1][goodsCount-1] = res;
        return res;
    }

}
