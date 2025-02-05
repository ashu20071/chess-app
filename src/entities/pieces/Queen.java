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
public class Queen extends Piece {

    public Queen() {
        super(PieceType.QUEEN);
    }

    @Override
    public List<List<Integer>> calculatePossibleMoves(int x, int y, Board board) {
        List<List<Integer>> possibleMoves = new ArrayList<>();
        for (int i = x - 1, j = y - 1; i >= 0 && j >= 0; i--, j--) {
            possibleMoves.add(List.of(i, j));
        }
        for (int i = x - 1; i >= 0; i--) {
            possibleMoves.add(List.of(i, y));
        }
        for (int j = y - 1; j >= 0; j--) {
            possibleMoves.add(List.of(x, j));
        }
        for (int i = x + 1, j = y + 1; i <= 7 && j <= 7; i++, j++) {
            possibleMoves.add(List.of(i, j));
        }
        for (int i = x + 1; i <= 7; i++) {
            possibleMoves.add(List.of(i, y));
        }
        for (int j = y + 1; j <= 7; j++) {
            possibleMoves.add(List.of(x, j));
        }
        for (int i = x - 1, j = y + 1; i >= 0 && j <= 7; i--, j++) {
            possibleMoves.add(List.of(i, j));
        }
        for (int i = x + 1, j = y - 1; i <= 7 && j >= 0; i++, j--) {
            possibleMoves.add(List.of(i, j));
        }
        return possibleMoves;
    }
}
