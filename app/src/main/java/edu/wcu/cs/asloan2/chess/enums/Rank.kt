package edu.wcu.cs.asloan2.chess.enums

enum class Rank (val rank : Int, val rankValue : Int) {


    R1(1,0),
    R2(2,1),
    R3(3,2),
    R4(4,3),
    R5(5,4),
    R6(6,5),
    R7(7,6),
    R8(8,7),
    R9(9,8),
    R10(10,9),
    R11(11,10),
    R12(12,11),
    R13(13,12),
    R14(14,13);

    companion object {

        fun getRankAt(value : Int) : Rank? {
            for(r in Rank.entries) {
                if(r.rankValue == value) {
                    return r
                }
            }
            return null
        }

        fun fromInt(value : Int) : Rank {
            for(r in Rank.entries) {
                if(r.rank == value) {
                    return r
                }
            }
            throw IllegalArgumentException("Invalid rank: $value")
        }

    }
}