import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hayden on 2017/10/9.
 */
public class TestTree {

    public static List<Integer> res = new ArrayList<>();
    public static node t = createNode();

    public static void main(String [] s){
        printNode(t);
        System.out.println(res);
        System.out.println(calcDeep(t));
    }

    public static void printNode(node n){
        if(n == null) return;
        printNode(n.left);
        printNode(n.right);
        res.add(n.value);
    }

    public static int calcDeep(node n){
        if(n == null) return 0;
        int left = calcDeep(n.left) + 1;
        int right = calcDeep(n.right) + 1;
        return left > right ? left : right;
    }

    public static node createNode(){
        node n3 = new node();
        n3.value = 3;
        node n7 = new node();
        n7.value = 7;
        node n5 = new node();
        n5.value = 5;
        node n6 = new node();
        n6.value = 6;
        node n1 = new node();
        n1.value = 1;
        n1.left=n3;
        n1.right=n7;
        node n2 = new node();
        n2.value = 2;
        n2.left=n5;
        n2.right=n6;
        node n4 = new node();
        n4.value = 4;
        n4.left=n1;
        n4.right=n2;
        return n4;
    }

}

class node{

    public int value;
    public node left;
    public node right;

}

