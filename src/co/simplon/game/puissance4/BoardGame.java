package co.simplon.game.puissance4;

public class BoardGame {
    private Token[][] board;

    // For unit tests
//    public BoardGame(Token[][] board) {
//        this.board = board;
//    }

    BoardGame(int width, int height) {
        this.board = new Token[width][height];
    }

    private int getLinePosition(int column) throws ColumnFullException {
        int maxColumnHeight = board[column - 1].length;
        int lineCounter = 1;
        while (lineCounter <= maxColumnHeight && board[column - 1][lineCounter - 1] != null) {
            ++lineCounter;
        }
        if (lineCounter > maxColumnHeight) {
            throw new ColumnFullException();
        }
        return lineCounter;
    }

    boolean play(Token token, int column) throws ColumnFullException, OutOfBoardColumnException {
        // Check that column number is valid
        if (column > board.length || column <= 0) {
            throw new OutOfBoardColumnException();
        }

        // Check the line position of the new token
        int linePosition = getLinePosition(column);

        // Set position of new played token
        board[column - 1][linePosition - 1] = token;

        // Check if there is a win
        boolean win = (horizontalCount(token, linePosition, column) > 3);

        if (!win)
            win |= (verticalCount(token, linePosition, column) > 3);

        if (!win)
            win |= (sWtoNECount(token, linePosition, column) > 3);

        if (!win)
            win |= (sEtoNWCount(token, linePosition, column) > 3);

        System.out.println(this);
        return win;
    }

    private int horizontalCount(Token token, int line, int column) {
        int horizontalCount = 0;

        // Column and line are starting at 1 but board game is an array of array (indexes start at 0)
        int columnPointer = column - 1;
        final int linePointer = line - 1;

        // We run through the board game from left to right starting at line and column position
        while (columnPointer < board.length && board[columnPointer][linePointer] == token) {
            ++horizontalCount;
            ++columnPointer;
        }

        // We run through the board game from left to right starting at line and (column - 1) position.
        columnPointer = column - 2;
        while (columnPointer >= 0 && board[columnPointer][linePointer] == token) {
            ++horizontalCount;
            --columnPointer;
        }

        return horizontalCount;
    }

    private int verticalCount(Token token, int line, int column) {
        int verticalCount = 0;

        // Column and line are starting at 1 but board game is an array of array (indexes start at 0)
        final int columnPointer = column - 1;
        int linePointer = line - 1;

        // We run through the board game from bottom to top starting at line and column position
        while (linePointer < board[columnPointer].length && board[columnPointer][linePointer] == token) {
            ++verticalCount;
            ++linePointer;
        }

        // We run through the board game from top to bottom starting at (line - 1) and column position.
        linePointer = line - 2;
        while (linePointer >= 0 && board[columnPointer][linePointer] == token) {
            ++verticalCount;
            --linePointer;
        }

        return verticalCount;
    }

    private int sWtoNECount(Token token, int line, int column) {
        int diagCount = 0;

        // Column and line are starting at 1 but board game is an array of array (indexes start at 0)
        int columnPointer = column - 1;
        int linePointer = line - 1;

        // We run through the board game from SW to NE at line and column position
        while (columnPointer < board.length && linePointer < board[columnPointer].length && board[columnPointer][linePointer] == token) {
            ++diagCount;
            ++linePointer;
            ++columnPointer;
        }

        // We run through the board game from NE to SW starting at (line - 1) and column position.
        linePointer = line - 2;
        columnPointer = column - 2;
        while (linePointer >= 0 && columnPointer >= 0 && board[columnPointer][linePointer] == token) {
            ++diagCount;
            --linePointer;
            --columnPointer;
        }

        return diagCount;
    }

    private int sEtoNWCount(Token token, int line, int column) {
        int diagCount = 0;

        // Column and line are starting at 1 but board game is an array of array (indexes start at 0)
        int columnPointer = column - 1;
        int linePointer = line - 1;

        // We run through the board game from SE to NW starting at line and column position
        while (columnPointer >= 0 && linePointer < board[columnPointer].length && board[columnPointer][linePointer] == token) {
            ++diagCount;
            ++linePointer;
            --columnPointer;
        }

        // We run through the board game from NW to SE starting at (line - 1) and column position.
        linePointer = line - 2;
        columnPointer = column;
        while (linePointer >= 0 && columnPointer < board.length && board[columnPointer][linePointer] == token) {
            ++diagCount;
            --linePointer;
            ++columnPointer;
        }

        return diagCount;
    }

    @Override
    public String toString() {
        String boardString = "";

        for (int j = board[0].length - 1; j >= 0; j--) {
            for (int i = 0; i < board.length; i++) {
                boardString += (board[i][j] != null) ? String.format("[%10s]", board[i][j]) : "[          ]";
            }
            boardString += "\n";
        }

        return boardString;
    }
}
