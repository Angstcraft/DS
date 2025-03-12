package ds;

public class Main {
    public static void main(String[] args) {
        Tree myBirch = new BirchTree(2, 3, 4);
        Tree myOak1 = new OakTree(3, 2, 4);
        Tree myOak2 = new OakTree(2, 3, 4);

        System.out.println("Comparing trees: " + myBirch.equals(myOak1));
        System.out.println("Comparing two birch trees: " + myBirch.equals(new BirchTree(2, 3, 4)));
    }
}