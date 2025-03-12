package ds;

public class BirchTree extends Tree {
    public BirchTree(int numBranches, int numTwigs, int numLeaves) {
        super(TreeType.BIRCH, numBranches, numTwigs, numLeaves);
    }

    @Override
    public void displayInfo() {
        System.out.println("This is a " + treeType + " tree.");
    }
}