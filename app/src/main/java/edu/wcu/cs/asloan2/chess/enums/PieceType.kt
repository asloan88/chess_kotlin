package edu.wcu.cs.asloan2.chess.enums

enum class PieceType(val abbr : Char, val fullName : String) {

    KING('K', "King"), //Enum type for a King chess piece
    QUEEN('Q', "Queen"), //Enum type for a Queen chess piece
    ROOK('R', "Rook"), //Enum type for a Rook chess piece
    BISHOP('B', "Bishop"),//Enum type for a Bishop chess piece
    KNIGHT('N', "Knight"),//Enum type for a Knight chess piece
    PAWN('P', "Pawn"),//Enum type for a Pawn chess piece
    EMPTY(' ', "Empty"),//Enum type for an empty chess square
    NULL('L', "Null"); // Default

    companion object {

        fun fromAbbr(abbr : Char) : PieceType {
            for(type in PieceType.entries) {
                if(abbr == type.abbr) {
                    return type
                }
            }
            throw IllegalArgumentException("Invalid type: $abbr")
        }
    }
}