package repository;

import entities.Piece;
import entities.PieceType;
import entities.pieces.King;
import entities.pieces.Pawn;
import entities.pieces.Queen;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ashutosh
 * date 05/02/25
 */
public class PieceRepository {
    private final Map<PieceType, Piece> pieces;

    public PieceRepository() {
        pieces = new HashMap<>();
        initializeRepository();
    }

    private void initializeRepository() {
        pieces.put(PieceType.KING, new King());
        pieces.put(PieceType.QUEEN, new Queen());
        pieces.put(PieceType.PAWN, new Pawn());
    }

    public Map<PieceType, Piece> getPieces() {
        return pieces;
    }
}
