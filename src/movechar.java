
/**
 * Created by Hayden on 2017/10/10.
 */
public class movechar {

    public static String ss = "*dw*ss***ccccc*****cad*dwa*dwa";

    public static void main(String [] s){

        char [] chars = ss.toCharArray();
        for(int i=0;i<chars.length;i+=1){
            if('*'== chars[i]){
                for(int j=i;j>0;j-=1){
                    chars[j] = chars[j-1];
                }
                chars[0] = '*';
            }
        }

        System.out.println(chars);
    }



}
