package utils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ashutosh
 * date 05/02/25
 */
public class ParsingUtil {
    public int[] parsePosition(String position) {
        // adjust based on ascii value
        int column = position.charAt(0) - 64;
        int row = Character.getNumericValue(position.charAt(1));

        if ((row < 1 || row > 8) || (column < 1 || column > 8)) {
            throw new IllegalArgumentException("Invalid position: " + position);
        }
        // to adjust for 0 based index in board matrix
        row--; column--;

        // adjust for inverse of matrix index and chess index
        row = 7 - row;
        return new int[]{row, column};
    }

    public List<String> parseMoves(List<List<Integer>> moves) {
        List<String> movesList = new ArrayList<>();
        for (List<Integer> move : moves) {
            int row = move.get(0);
            int column = move.get(1);

            // inverse back
            row = 7 - row;

            // convert back to 1 based index
            row++; column++;

            // convert back to char and construct string
            String parsedValue = Character.toString(column + 64) + row;
            movesList.add(parsedValue);
        }
        return movesList;
    }
}
