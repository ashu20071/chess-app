import entities.Board;
import entities.Piece;
import entities.PieceType;
import repository.PieceRepository;
import utils.ParsingUtil;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws Exception {
        if (args.length < 2) {
            throw new Exception("Please enter piece type and position");
        }

        // todo: have proper validations on inputs
        String pieceType = args[0];
        String position = args[1];

        // initialize board and piece repository
        Board board = new Board();
        PieceRepository pieceRepository = new PieceRepository();
        ParsingUtil parsingUtil = new ParsingUtil();
        Map<PieceType, Piece> pieces = pieceRepository.getPieces();

        // this could throw IllegalArgumentException if invalid piece type is entered as input
        // todo: need to handle this gracefully if possible
        Piece piece = pieces.get(PieceType.valueOf(pieceType));
        int[] parsedPosition = parsingUtil.parsePosition(position);

        List<List<Integer>> possibleMoves = piece.calculatePossibleMoves(parsedPosition[0], parsedPosition[1], board);
        List<String> parsedMoves = parsingUtil.parseMoves(possibleMoves);
        System.out.println("Possible moves: " + parsedMoves);
    }
}