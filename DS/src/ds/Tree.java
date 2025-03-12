package ds;

public abstract class Tree {
    protected Stem stem;
    protected TreeType treeType;

    public Tree(TreeType treeType, int numBranches, int numTwigs, int numLeaves) {
        this.treeType = treeType;
        this.stem = new Stem(numBranches, numTwigs, numLeaves);
    }

    public abstract void displayInfo();

    public Stem getStem() {
        return stem;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Tree tree = (Tree) obj;
        return stem.equals(tree.stem) && treeType == tree.treeType;
    }
}