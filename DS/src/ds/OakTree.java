package ds;

public class OakTree extends Tree {
    public OakTree(int numBranches, int numTwigs, int numLeaves) {
        super(TreeType.OAK, numBranches, numTwigs, numLeaves);
    }

    @Override
    public void displayInfo() {
        System.out.println("This is an " + treeType + " tree.");
    }
}