package DataStructures.Tests;

import DataStructures.Types.BasicBinaryTree;

public class BasicBinaryTreeTest {
    public static void main(String args[]){
        BasicBinaryTree t1 = new BasicBinaryTree();

        t1.add(10);
        t1.add(5);
        t1.add(20);
        t1.add(4);
        t1.add(9);
        t1.add(15);
        t1.add(13);
        t1.add(18);
        t1.add(25);
        t1.add(22);
        t1.add(27);

        t1.drawTree();


        t1.delete(15);
        t1.drawTree();
    }
}
