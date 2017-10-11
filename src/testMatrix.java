import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by zhaochongwang on 2017/10/9.
 */
public class testMatrix {

    public static int [][] matrix = {{1,3,4,7},
                                     {4,3,4,5},
                                     {6,2,4,2},
                                     {1,3,3,7}};

    public static int [][] dp = {{0,0,0,0},
                                 {0,0,0,0},
                                 {0,0,0,0},
                                 {0,0,0,0}};

    public static List<Integer> route = new ArrayList<>();

    public static void main(String [] s){

        System.out.println(move2last(3,3));



        for(int i=0;i<4;i+=1){
            for(int j=0;j<4;j+=1){
                System.out.print(dp[i][j] + ",");

            }
            System.out.print("\n");
        }

        addRoute(3,3);
        System.out.println(route);
        Collections.reverse(route);
        System.out.println(route);

    }

    private static void addRoute(int i,int j) {



        while (i>0 || j > 0){

            route.add(matrix[i][j]);

            if(i == 0){
                //route.add(matrix[i][j-1]);
                j -= 1;
            }else if(j == 0){
                //route.add(matrix[i-1][j]);
                i -= 1;
            }else{
                //route.add(matrix[i][j]);
                if(dp[i-1][j]<dp[i][j-1]){
                    i -= 1;
                }else{
                    j -= 1;
                }
            }
        }

        route.add(matrix[0][0]);

    }

    public static int move2last(int i, int j){

        if(dp[i][j] > 0) return dp[i][j];

        int res = 0;

        if(i==0 && j==0){
            res = matrix[0][0];
        }else if(i==0){
            res = matrix[0][j] + move2last(0,j-1);
        }else if(j==0){
            res = matrix[i][0] + move2last(i-1,0);
        }else{
            res = Math.min(move2last(i,j-1),move2last(i-1,j)) + matrix[i][j];
        }

        dp[i][j] = res;
        return  res;
    }

}
