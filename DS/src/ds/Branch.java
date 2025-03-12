package ds;

import java.util.TreeSet;

public class Branch implements Comparable<Branch> {
    private TreeSet<Twig> twigs;

    public Branch(int numTwigs, int numLeaves) {
        twigs = new TreeSet<>();
        for (int i = 0; i < numTwigs; i++) {
            twigs.add(new Twig(numLeaves));
        }
    }

    public TreeSet<Twig> getTwigs() {
        return twigs;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Branch branch = (Branch) obj;
        return twigs.equals(branch.twigs);
    }

    @Override
    public int compareTo(Branch other) {
        return Integer.compare(this.twigs.size(), other.twigs.size());
    }
}