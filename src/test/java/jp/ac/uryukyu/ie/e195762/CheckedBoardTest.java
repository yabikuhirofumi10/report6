package jp.ac.uryukyu.ie.e195762;

import static org.junit.jupiter.api.Assertions.*;

class CheckedBoardTest {

    @org.junit.jupiter.api.Test
    void upperLeft() {
        CheckedBoard cb = new CheckedBoard();
        cb.board.putOrTurnStone("●",3,3);
        cb.board.showBoard();
        System.out.println("");
        cb.upperLeft("●",6,6);
        assertEquals(cb.board.list[5][5],"●");
        assertEquals(cb.board.list[4][4],"●");
        cb.board.showBoard();
    }
}