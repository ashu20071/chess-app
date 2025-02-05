package entities.pieces;

import entities.Board;
import entities.Piece;
import entities.PieceType;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ashutosh
 * date 02/02/25
 */
public class King extends Piece {

    public King() {
        super(PieceType.KING);
    }

    @Override
    public List<List<Integer>> calculatePossibleMoves(int x, int y, Board board) {
        List<List<Integer>> possibleMoves = new ArrayList<>();
        if (x - 1 >= 0 && y - 1 >= 0) {
            possibleMoves.add(List.of(x - 1, y - 1));
        }
        if (x - 1 >= 0) {
            possibleMoves.add(List.of(x - 1, y));
        }
        if (y - 1 >= 0) {
            possibleMoves.add(List.of(x, y - 1));
        }
        if (x + 1 <= 7 && y + 1 <= 7) {
            possibleMoves.add(List.of(x + 1, y + 1));
        }
        if (x + 1 <= 7) {
            possibleMoves.add(List.of(x + 1, y));
        }
        if (y + 1 <= 7) {
            possibleMoves.add(List.of(x, y + 1));
        }
        if (x - 1 >= 0 && y + 1 <= 7) {
            possibleMoves.add(List.of(x - 1, y + 1));
        }
        if (y - 1 >= 0 && x + 1 <= 7) {
            possibleMoves.add(List.of(x + 1, y - 1));
        }
        return possibleMoves;
    }

}
