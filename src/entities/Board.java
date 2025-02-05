package entities;

/**
 * @author ashutosh
 * date 02/02/25
 */
public class Board {
    private Piece[][] board;

    public Board() {
        board = new Piece[8][8];
    }

    public Piece[][] getBoard() {
        return board;
    }
}
