class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] row = new HashSet[9];
        HashSet<Character>[] col = new HashSet[9];
        HashSet<Character>[] box = new HashSet[9];

        for (int i = 0; i < 9; i++) {
            row[i] = new HashSet<Character>();
            col[i] = new HashSet<Character>();
            box[i] = new HashSet<Character>();
        }

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                char character = board[r][c];
                if (character == '.') {
                    continue;
                }
                int val = (r/3)*3+(c/3);
                if (row[r].contains(character) || col[c].contains(character) || box[val].contains(character)) {
                    return false;
                }
                row[r].add(character);
                col[c].add(character);
                box[val].add(character);
            }
        }
        return true;
    }
}
