import java.io.*;
import java.util.*;

class Node{
    char value;
    Node left;
    Node right;
    public Node(char value){
        this.value = value;
        left = null;
        right = null;
    }
}

public class Main {
    static Node[] tree;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        tree = new Node[n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            char parentValue = st.nextToken().charAt(0);
            char leftValue = st.nextToken().charAt(0);
            char rightValue = st.nextToken().charAt(0);
            if (tree[parentValue-'A'] == null) {  //만약 부모노드가없으면 만들자
                tree[parentValue-'A'] = new Node(parentValue);
            }
            if (leftValue!='.') { //만약 왼쪽자식경우가 있을경우
                tree[leftValue-'A'] = new Node(leftValue);
                tree[parentValue-'A'].left = tree[leftValue-'A'];
            }
            if (rightValue!='.') {
                tree[rightValue-'A'] = new Node(rightValue);
                tree[parentValue-'A'].right = tree[rightValue-'A'];
            }
        }
        전위순회(tree[0]);
        System.out.println();
        중위순회(tree[0]);
        System.out.println();
        후위순회(tree[0]);
    }

    public static void 전위순회(Node node){
        if(node==null) return;
        System.out.print(node.value);
        전위순회(node.left);
        전위순회(node.right);
    }
    public static void 중위순회(Node node){
        if(node==null) return;
        중위순회(node.left);
        System.out.print(node.value);
        중위순회(node.right);
    }
    public  static void 후위순회(Node node){
        if(node==null) return;
        후위순회(node.left);
        후위순회(node.right);
        System.out.print(node.value);
    }


}