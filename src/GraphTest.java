/**
 * Created by Hayden on 2017/10/10.
 */
public class GraphTest {

    public static int [] isRead = {0,0,0,0,0};
    public static int [][] graphMatrix = {{0,1,1,0,0},
                                          {1,0,1,0,0},
                                          {1,1,0,0,0},
                                          {0,0,0,0,1},
                                          {0,0,0,1,0}};

    public static void main(String [] s){

        printNode();

    }

    public static void printNode(){

        for(int i=0;i<isRead.length;i+=1){
            if(isRead[i] == 0){
                deepPrintNode(i);
            }
        }

    }

    private static void deepPrintNode(int i) {

        if(isRead[i] == 0){
            isRead[i] = 1;
            for(int j=0;j<isRead.length;j+=1){
                if(graphMatrix[i][j] > 0){
                    deepPrintNode(j);
                }
            }
            System.out.println(i);
        }
    }

}
