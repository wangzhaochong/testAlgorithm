
/**
 * Created by Hayden on 2017/10/10.
 * 最大公约数
 */
public class testgcd {



    public static void main(String [] s){

        System.out.println(gcd(18,12));
    }

    private static int gcd(int m,int n) {

        int r = m%n;
        if(r == 0) return n;
        else return gcd(n,r);

    }


}
