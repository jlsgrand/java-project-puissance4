public class BoardGameTest {

//    @Test
//    public void playFirstColumn1() throws ColumnFullException {
//        Token[][] existingGame = {
//                {null, null, null, null, null, null},
//                {null, null, null, null, null, null},
//                {null, null, null, null, null, null},
//                {null, null, null, null, null, null},
//                {null, null, null, null, null, null},
//                {null, null, null, null, null, null},
//                {null, null, null, null, null, null}
//        };
//
//        BoardGame bg = new BoardGame(existingGame);
//        int row = bg.getLinePosition(1);
//        assertEquals(1, row);
//    }
//
//    @Test
//    public void playSecondColumn1() throws ColumnFullException {
//        Token[][] existingGame = {
//                {Token.YELLOW, null, null, null, null, null},
//                {null, null, null, null, null, null},
//                {null, null, null, null, null, null},
//                {null, null, null, null, null, null},
//                {null, null, null, null, null, null},
//                {null, null, null, null, null, null},
//                {null, null, null, null, null, null}
//        };
//
//        BoardGame bg = new BoardGame(existingGame);
//        int row = bg.getLinePosition(1);
//        assertEquals(2, row);
//    }
//
//    @Test
//    public void playThirdColumn1() throws ColumnFullException {
//        Token[][] existingGame = {
//                {Token.YELLOW, Token.RED, null, null, null, null},
//                {null, null, null, null, null, null},
//                {null, null, null, null, null, null},
//                {null, null, null, null, null, null},
//                {null, null, null, null, null, null},
//                {null, null, null, null, null, null},
//                {null, null, null, null, null, null}
//        };
//
//        BoardGame bg = new BoardGame(existingGame);
//        int row = bg.getLinePosition(1);
//        assertEquals(3, row);
//    }
//
//    @Test
//    public void playColumn1Full() {
//        Token[][] existingGame = {
//                {Token.YELLOW, Token.RED, Token.YELLOW, Token.RED, Token.YELLOW, Token.RED},
//                {null, null, null, null, null, null},
//                {null, null, null, null, null, null},
//                {null, null, null, null, null, null},
//                {null, null, null, null, null, null},
//                {null, null, null, null, null, null},
//                {null, null, null, null, null, null}
//        };
//
//        BoardGame bg = new BoardGame(existingGame);
//        assertThrows(ColumnFullException.class, () -> bg.getLinePosition(1));
//    }
//
//    @Test
//    public void playNotWinning() throws OutOfBoardColumnException, ColumnFullException {
//        Token[][] existingGame = {
//                {Token.YELLOW, null, null, null, null, null},
//                {Token.YELLOW, null, null, null, null, null},
//                {null, null, null, null, null, null},
//                {null, null, null, null, null, null},
//                {null, null, null, null, null, null},
//                {null, null, null, null, null, null},
//                {null, null, null, null, null, null}
//        };
//
//        BoardGame bg = new BoardGame(existingGame);
//        boolean win = bg.play(Token.RED, 1);
//        assertFalse(win);
//    }
//
//    @Test
//    public void playWinning() throws OutOfBoardColumnException, ColumnFullException {
//        Token[][] existingGame = {
//                {Token.YELLOW, Token.RED, null, null, null, null},
//                {Token.YELLOW, Token.RED, null, null, null, null},
//                {Token.RED, null, null, null, null, null},
//                {Token.YELLOW, Token.RED, null, null, null, null},
//                {Token.YELLOW, Token.RED, null, null, null, null},
//                {Token.YELLOW, Token.RED, null, null, null, null},
//                {null, null, null, null, null, null}
//        };
//
//        BoardGame bg = new BoardGame(existingGame);
//        boolean win = bg.play(Token.YELLOW, 7);
//        assertTrue(win);
//    }
//
//
//    @Test
//    public void count3RedLine2Column4Horizontal() {
//        Token[][] existingGame = {
//                {Token.YELLOW, Token.RED, null, null, null, null},
//                {Token.YELLOW, Token.RED, null, null, null, null},
//                {Token.RED, null, null, null, null, null},
//                {Token.YELLOW, Token.RED, null, null, null, null},
//                {Token.YELLOW, Token.RED, null, null, null, null},
//                {Token.YELLOW, Token.RED, null, null, null, null},
//                {null, null, null, null, null, null}
//        };
//
//        BoardGame bg = new BoardGame(existingGame);
//        int hCount = bg.horizontalCount(Token.RED, 2, 4);
//        assertEquals(3, hCount);
//    }
//
//    @Test
//    public void count2YellowLine1Column1Horizontal() {
//        Token[][] existingGame = {
//                {Token.YELLOW, Token.RED, null, null, null, null},
//                {Token.YELLOW, Token.RED, null, null, null, null},
//                {Token.RED, null, null, null, null, null},
//                {Token.YELLOW, Token.RED, null, null, null, null},
//                {Token.YELLOW, Token.RED, null, null, null, null},
//                {Token.YELLOW, Token.RED, null, null, null, null},
//                {null, null, null, null, null, null}
//        };
//
//        BoardGame bg = new BoardGame(existingGame);
//        int hCount = bg.horizontalCount(Token.YELLOW, 1, 1);
//        assertEquals(2, hCount);
//    }
//
//    @Test
//    public void count0RedLine1Column7Horizontal() {
//        Token[][] existingGame = {
//                {Token.YELLOW, Token.RED, null, null, null, null},
//                {Token.YELLOW, Token.RED, null, null, null, null},
//                {Token.RED, null, null, null, null, null},
//                {Token.YELLOW, Token.RED, null, null, null, null},
//                {Token.YELLOW, Token.RED, null, null, null, null},
//                {Token.YELLOW, Token.RED, null, null, null, null},
//                {null, null, null, null, null, null}
//        };
//
//        BoardGame bg = new BoardGame(existingGame);
//        int hCount = bg.horizontalCount(Token.RED, 1, 7);
//        assertEquals(0, hCount);
//    }
//
//    @Test
//    public void count3RedLine4Column4Vertical() {
//        Token[][] existingGame = {
//                {Token.YELLOW, Token.RED, null, null, null, null},
//                {Token.YELLOW, Token.RED, null, null, null, null},
//                {Token.RED, null, null, null, null, null},
//                {Token.YELLOW, Token.RED, Token.RED, Token.RED, null, null},
//                {Token.YELLOW, Token.RED, null, null, null, null},
//                {Token.YELLOW, Token.RED, null, null, null, null},
//                {null, null, null, null, null, null}
//        };
//
//        BoardGame bg = new BoardGame(existingGame);
//        int vCount = bg.verticalCount(Token.RED, 4, 4);
//        assertEquals(3, vCount);
//    }
//
//    @Test
//    public void count0RedLine1Column7Vertical() {
//        Token[][] existingGame = {
//                {Token.YELLOW, Token.RED, null, null, null, null},
//                {Token.YELLOW, Token.RED, null, null, null, null},
//                {Token.RED, null, null, null, null, null},
//                {Token.YELLOW, Token.RED, Token.RED, Token.RED, null, null},
//                {Token.YELLOW, Token.RED, null, null, null, null},
//                {Token.YELLOW, Token.RED, null, null, null, null},
//                {null, null, null, null, null, null}
//        };
//
//        BoardGame bg = new BoardGame(existingGame);
//        int vCount = bg.verticalCount(Token.RED, 1, 7);
//        assertEquals(0, vCount);
//    }
//
//    @Test
//    public void count1YellowLine1Column7Vertical() {
//        Token[][] existingGame = {
//                {Token.YELLOW, Token.RED, null, null, null, null},
//                {Token.YELLOW, Token.RED, null, null, null, null},
//                {Token.RED, null, null, null, null, null},
//                {Token.YELLOW, Token.RED, Token.RED, Token.RED, null, null},
//                {Token.YELLOW, Token.RED, null, null, null, null},
//                {Token.YELLOW, Token.RED, null, null, null, null},
//                {Token.YELLOW, null, null, null, null, null}
//        };
//
//        BoardGame bg = new BoardGame(existingGame);
//        int vCount = bg.verticalCount(Token.YELLOW, 1, 7);
//        assertEquals(1, vCount);
//    }
//
//    @Test
//    public void count1RedLine2Column6Vertical() {
//        Token[][] existingGame = {
//                {Token.YELLOW, Token.RED, null, null, null, null},
//                {Token.YELLOW, Token.RED, null, null, null, null},
//                {Token.RED, null, null, null, null, null},
//                {Token.YELLOW, Token.RED, Token.RED, Token.RED, null, null},
//                {Token.YELLOW, Token.RED, null, null, null, null},
//                {Token.YELLOW, Token.RED, null, null, null, null},
//                {null, null, null, null, null, null}
//        };
//
//        BoardGame bg = new BoardGame(existingGame);
//        int vCount = bg.verticalCount(Token.RED, 2, 6);
//        assertEquals(1, vCount);
//    }
//
//    @Test
//    public void count4RedLine5Column6SWtoNE() {
//        Token[][] existingGame = {
//                {Token.YELLOW, Token.RED, null, null, null, null},
//                {Token.YELLOW, Token.RED, null, null, null, null},
//                {Token.RED, Token.RED, null, null, null, null},
//                {Token.YELLOW, Token.RED, Token.RED, Token.RED, null, null},
//                {Token.YELLOW, Token.RED, Token.RED, Token.RED, null, null},
//                {Token.YELLOW, Token.RED, Token.YELLOW, Token.YELLOW, Token.RED, null},
//                {null, null, null, null, null, null}
//        };
//
//        BoardGame bg = new BoardGame(existingGame);
//        int dCount = bg.sWtoNECount(Token.RED, 5, 6);
//        assertEquals(4, dCount);
//    }
//
//    @Test
//    public void count3RedLine4Column4SEtoNW() {
//        Token[][] existingGame = {
//                {Token.YELLOW, Token.RED, null, null, null, null},
//                {Token.YELLOW, Token.RED, null, null, null, null},
//                {Token.RED, Token.RED, null, null, null, null},
//                {Token.YELLOW, Token.RED, Token.RED, Token.RED, null, null},
//                {Token.YELLOW, Token.RED, Token.RED, Token.RED, null, null},
//                {Token.YELLOW, Token.RED, Token.YELLOW, Token.YELLOW, Token.RED, null},
//                {null, null, null, null, null, null}
//        };
//
//        BoardGame bg = new BoardGame(existingGame);
//        int dCount = bg.sEtoNWCount(Token.RED, 4, 4);
//        assertEquals(3, dCount);
//    }
//
//    @Test
//    public void count4YellowLine4Column2SEtoNW() {
//        Token[][] existingGame = {
//                {Token.YELLOW, Token.RED, null, null, null, null},
//                {Token.YELLOW, Token.RED, Token.RED, Token.YELLOW, null, null},
//                {Token.RED, Token.RED, Token.YELLOW, null, null, null},
//                {Token.YELLOW, Token.YELLOW, Token.RED, Token.RED, null, null},
//                {Token.YELLOW, Token.RED, Token.RED, Token.RED, null, null},
//                {Token.YELLOW, Token.RED, Token.YELLOW, Token.YELLOW, Token.RED, null},
//                {null, null, null, null, null, null}
//        };
//
//        BoardGame bg = new BoardGame(existingGame);
//        int dCount = bg.sEtoNWCount(Token.YELLOW, 4, 2);
//        assertEquals(4, dCount);
//    }
}
