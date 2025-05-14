package edu.wcu.cs.asloan2.chess.enums

enum class File(val file : Char, val fileValue : Int) {

    A('a',0),//Enum for the A file
    B('b', 1),//Enum for the B file
    C('c',2),//Enum for the C file
    D('d',3),//Enum for the D file
    E('e',4),//Enum for the E file
    F('f',5),//Enum for the F file
    G('g',6),//Enum for the G file
    H('h',7),//Enum for the H file
    I('i',8),//Enum for the I file
    J('j',9),//Enum for the J file
    K('k',10),//Enum for the K file
    L('l',11),//Enum for the L file
    M('m',12),//Enum for the M file
    N('n',13);//Enum for the N file

    companion object {

        fun getFileAt(value : Int) : File? {
            for(f in File.entries) {
                if(f.fileValue == value) {
                    return f
                }
            }
            return null
        }

        fun fromChar(c : Char) : File {
            for(f in File.entries) {
                if(f.file == c.lowercaseChar()) {
                    return f
                }
            }
            throw IllegalArgumentException("Invalid file: $c")
        }

    }
}