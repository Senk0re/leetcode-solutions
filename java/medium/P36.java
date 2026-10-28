import java.util.HashSet;
import java.util.Set;

class P36 {
    public static void main(String[] args) {
        char[][] board = { { '1', '2', '.', '.', '3', '.', '.', '.', '.' },
                { '4', '.', '.', '5', '.', '.', '.', '.', '.' },
                { '.', '9', '1', '.', '.', '.', '.', '.', '3' },
                { '5', '.', '.', '.', '6', '.', '.', '.', '4' },
                { '.', '.', '.', '8', '.', '3', '.', '.', '5' },
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
                { '.', '.', '.', '.', '.', '.', '2', '.', '.' },
                { '.', '.', '.', '4', '1', '9', '.', '.', '8' },
                { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
        };
        System.out.println(isValidSudoku(board));
    }

    public static boolean isValidSudoku(char[][] board) {
        Set<Character>[] Boxes = new HashSet[9];
        for (int i = 0; i < Boxes.length; i++) {
            Boxes[i] = new HashSet<>();
        }
        for (int i = 0; i < board.length; i++) {
            Set<Character> setRows = new HashSet<>();
            Set<Character> setCols = new HashSet<>();
            for (int j = 0; j < board.length; j++) {
                // checks rows
                if (board[i][j] >= '1' && board[i][j] <= '9') {
                    if (setRows.contains(board[i][j])) {
                        return false;
                    } else {
                        setRows.add(board[i][j]);
                    }
                }
                // checks columns
                if (board[j][i] >= '1' && board[j][i] <= '9') {
                    if (setCols.contains(board[j][i])) {
                        return false;
                    } else {
                        setCols.add(board[j][i]);
                    }
                }
                // check boxes
                if (board[i][j] >= '1' && board[i][j] <= '9') {
                    int box = (i / 3) * 3 + j / 3;
                    if (Boxes[box].contains(board[i][j])) {
                        return false;
                    } else {
                        Boxes[box].add(board[i][j]);
                    }
                }

            }

        }
        for (int i = 0; i < Boxes.length; i++) {
            System.out.println(Boxes[i]);
        }
        return true;
    }
}
