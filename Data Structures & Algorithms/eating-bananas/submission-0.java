class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for (int c : piles) {
            max = Math.max(c,max);
        } // we have the upper bound
        int l = 1;
        int r = max;
        while (l < r) {
            int middle = l+(r-l)/2;
            if (isValid(middle, h, piles)) {
                r = middle;
            }
            else {
                l = middle+1;
            }
        }
        return l;
    }
    public boolean isValid(int bananasPerHour, int h, int[] piles) {
        int time = 0;
        for (int c : piles) {
            time += Math.ceil((double) c / bananasPerHour);
        }
        if (time > h) {
            return false;
        }
        return true;
    }
}
