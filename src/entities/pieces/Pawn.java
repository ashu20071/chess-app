package entities.pieces;

import entities.Board;
import entities.Piece;
import entities.PieceType;

import java.util.ArrayList;
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
        List<List<Integer>> possibleMoves = new ArrayList<>();
        if (x - 1 >= 0) {
            possibleMoves.add(List.of(x - 1, y));
        }
        return possibleMoves;
    }
}
