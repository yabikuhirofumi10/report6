package jp.ac.uryukyu.ie.e195762;

import static org.junit.jupiter.api.Assertions.*;

class CheckedBoardTest {

    @org.junit.jupiter.api.Test
    void upperLeft() {
        CheckedBoard cb = new CheckedBoard();
        cb.board.putOrTurnStone("●",6,6);
        //cb.board.putOrTurnStone("●",6,5);
        //cb.board.putOrTurnStone("●",6,2);
        cb.board.showBoard();
        System.out.println("");
        cb.upperLeft("○",7,7);
        assertEquals(cb.board.list[6][6], "○");
    }
}