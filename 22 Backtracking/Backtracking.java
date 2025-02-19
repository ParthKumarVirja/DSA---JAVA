public class Backtracking {
        public static boolean validateSudoku(char[][] board) {
            // Initialize arrays to keep track of the digits seen in each row, column, and sub-box
            boolean[][] rows = new boolean[9][9];
            boolean[][] cols = new boolean[9][9];
            boolean[][] boxes = new boolean[9][9];
    
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    if (board[i][j] != '.') {
                        int num = board[i][j] - '1'; // Convert char to int (0-8)
                        int boxIndex = (i / 3) * 3 + (j / 3); // Calculate box index
    
                        // Check if the number is already seen in the current row, column, or box
                        if (rows[i][num] || cols[j][num] || boxes[boxIndex][num]) {
                            return false;
                        }
    
                        // Mark the number as seen in the current row, column, and box
                        rows[i][num] = true;
                        cols[j][num] = true;
                        boxes[boxIndex][num] = true;
                    }
                }
            }
    
            return true;
        }



    public static boolean isSafe(char board[][],int row,int col,int digit) {
        for(int i=0; i<board.length; i++) {
            if(board[i][col] == (char)(digit+'0')) {
                return false;
            }
            if(board[row][i] == (char)(digit+'0')) {
                return false;
            }
        }
        int sr = (row/3) * 3;
        int sc = (col/3) * 3;
        for(int i=sr; i<sr+3; i++) {
            for(int j=sc; j<sc+3; j++) {
                if(board[i][j] == (char)(digit+'0')) {
                    return false;
                }
            }
        }
        return true;
    }
    public boolean sudoku(char board[][], int row, int col) {
        // base case
        if(row == board.length) {
            return true;
        }

        //recursion
        int nrow = row;
        int ncol = col + 1;
        if(col+1 == board.length) {
            nrow = row + 1;
            ncol = 0;
        }
        if(board[row][col] != '.') {
            return sudoku(board, nrow, ncol);
        }
        for(int digit=1; digit<=9; digit++) {
            if(isSafe(board,row,col,digit)) {
                board[row][col] = (char)(digit+'0');
                if(sudoku(board,nrow,ncol)) {
                    return true;
                }
                board[row][col] = '.';
            }
        }
        return false;
    }
    public void solveSudoku(char[][] board) {
        sudoku(board, 0, 0);
    }

    public static void main(String[] args) {
        Backtracking sol = new Backtracking();
        
        // Example of a valid Sudoku board
        char[][] validBoard = {
            {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
            {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
            {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
            {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
            {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
            {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
            {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        // Example of an invalid Sudoku board
        char[][] invalidBoard = {
            {'8', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
            {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
            {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
            {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
            {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
            {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
            {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        // Test the valid board
        System.out.println("Is the valid board valid? " + sol.validateSudoku(validBoard)); // Output: true

        // Test the invalid board
        System.out.println("Is the invalid board valid? " + sol.validateSudoku(invalidBoard)); // Output: false
    }
}