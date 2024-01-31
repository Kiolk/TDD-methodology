fun Int.toRoman(): String {
    return when {
        1 == this -> "I"
        2 == this -> "II"
        3 == this -> "III"
        5 == this -> "V"
        10 == this -> "X"
        (this % 10) >= 1 && (this % 10) <= 3 -> 10.toRoman() + (this % 10).toRoman()
        (this % 10) >= 4 && (this / 10) > 0 -> 10.toRoman() + (this - 10).toRoman()
        (this % 10) == 9 -> 1.toRoman() + 10.toRoman()
        (this % 5) >= 1 -> if (this % 5 == 4) 1.toRoman() + 5.toRoman() else 5.toRoman() + (this % 5).toRoman()
        else -> ""
    }
}
