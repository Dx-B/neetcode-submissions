class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for (int c : piles) {
            max = Math.max(max,c);
        }
        int l = 1;
        int r = max;
        while (l <= r) {
            int middle = (l+r)/2;
            if (isValid(middle,piles,h)) {
                r = middle-1;
            }
            else {
                l = middle+1;
            }
        }
        return l;
    }
    private boolean isValid(int num, int[] piles, int h) {
        int total = 0;
        for (int c : piles) {
            total+= (c + num - 1) / num;;
        }
        return total <= h;
    }
}
