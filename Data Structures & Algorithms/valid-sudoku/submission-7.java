class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character>[] rows = new HashSet[9];
        Set<Character>[] cols = new HashSet[9];
        Set<Character>[] boxes = new HashSet[9];
        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<Character>();
            cols[i] = new HashSet<Character>();
            boxes[i] = new HashSet<Character>();
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int box = (i/3)*3 + (j/3);
                if (board[i][j] == '.') {
                    continue;
                }
                if (rows[i].contains(board[i][j])) {
                    return false;
                }
                else {
                    rows[i].add(board[i][j]);
                }
                if (cols[j].contains(board[i][j])) {
                    return false;
                }
                else {
                    cols[j].add(board[i][j]);
                }
                if (boxes[box].contains(board[i][j])) {
                    return false;
                }
                else {
                    boxes[box].add(board[i][j]);
                }
            }
        }
        return true;
    }
}
