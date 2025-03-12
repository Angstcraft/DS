package ds;

import java.util.TreeSet;

public class Stem {
    private TreeSet<Branch> branches;

    public Stem(int numBranches, int numTwigs, int numLeaves) {
        branches = new TreeSet<>();
        for (int i = 0; i < numBranches; i++) {
            branches.add(new Branch(numTwigs, numLeaves));
        }
    }

    public TreeSet<Branch> getBranches() {
        return branches;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Stem stem = (Stem) obj;
        return branches.equals(stem.branches);
    }
}