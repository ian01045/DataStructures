package academy.learningprogramming.BinarySearchTree;

public class Main {

    public static void main(String[] arg){
        Tree intTree = new Tree();
        intTree.insert(25);
        intTree.insert(20);
        intTree.insert(15);
        intTree.insert(27);
        intTree.insert(30);
        intTree.insert(29);
        intTree.insert(26);
        intTree.insert(22);
        intTree.insert(32);

        intTree.traverseInOrder();

        System.out.println();
        System.out.println(intTree.get(27).getData());
        System.out.println(intTree.get(15).getData());
        System.out.println(intTree.get(8888));

        System.out.println(intTree.min());
        System.out.println(intTree.max());
    }
}
