package entities.pieces;

import entities.Board;
import entities.Piece;
import entities.PieceType;

import java.util.List;

/**
 * @author ashutosh
 * date 04/02/25
 */
public class Pawn extends Piece {

    public Pawn() {
        super(PieceType.PAWN);
    }

    @Override
    public List<List<Integer>> calculatePossibleMoves(int x, int y, Board board) {
        return null;
    }
}
