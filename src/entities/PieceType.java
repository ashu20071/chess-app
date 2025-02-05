package entities;

/**
 * @author ashutosh
 * date 02/02/25
 */
public enum PieceType {
    KING("KING"),
    QUEEN("QUEEN"),
    PAWN("PAWN");

    private final String name;

    PieceType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
