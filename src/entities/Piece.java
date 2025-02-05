package entities;

import java.util.List;

/**
 * @author ashutosh
 * date 02/02/25
 */
public abstract class Piece {
    private PieceType pieceType;

    public Piece() {
    }

    public Piece(PieceType pieceType) {
        this.pieceType = pieceType;
    }

    public PieceType getPieceType() {
        return pieceType;
    }

    public abstract List<List<Integer>> calculatePossibleMoves(int x, int y, Board board);
}
