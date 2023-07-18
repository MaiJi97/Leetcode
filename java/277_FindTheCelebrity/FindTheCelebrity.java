/* The knows API is defined in the parent class Relation.
      boolean knows(int a, int b); */

public class Solution extends Relation {

    private int numberOfPeople;
    public int findCelebrity(int n) {
        numberOfPeople = n;
        int celebrityCandidate = 0;
        for (int i = 0; i < n; i++) {
            if (knows(celebrityCandidate, i)) {
                celebrityCandidate = i;
            }
        }
        return isCelebrity(celebrityCandidate) ? celebrityCandidate : -1;
    }

    private boolean isCelebrity(int n) {
        for (int i = 0; i < numberOfPeople; i++) {
            if (i == n) continue;
            if (!knows(i, n) || knows(n, i)) return false;
        }
        return true;
    }
}
