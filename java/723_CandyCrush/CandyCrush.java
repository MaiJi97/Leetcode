class Solution {
    public int[][] candyCrush(int[][] board) {
        boolean toDo = false;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length - 2; j++) {
                int val = Math.abs(board[i][j]);
                if (val != 0 && val == Math.abs(board[i][j+1]) && val == Math.abs(board[i][j+2])){
                    board[i][j] = - val;
                    board[i][j+1] = - val;
                    board[i][j+2] = - val;
                    toDo = true;
                }
            }
        }
        for (int j = 0; j < board[0].length; j++) {
            for (int i = 0; i < board.length - 2; i++) {
                int val = Math.abs(board[i][j]);
                if (val != 0 && val == Math.abs(board[i+1][j]) && val == Math.abs(board[i+2][j])){
                    board[i][j] = - val;
                    board[i+1][j] = - val;
                    board[i+2][j] = - val;
                    toDo = true;
                }
            }
        }
        for (int i = 0; i < board[0].length; i++) {
            int writePointer = board.length - 1;
            for (int pointer = board.length - 1; pointer >= 0; pointer--) {
                if (board[pointer][i] > 0) {
                    board[writePointer][i] = board[pointer][i];
                    writePointer--;
                }
            }
            while (writePointer >= 0) {
                board[writePointer][i] = 0;
                writePointer--;
            }   
        }
        return toDo == true ? candyCrush(board) : board;
    }
}
