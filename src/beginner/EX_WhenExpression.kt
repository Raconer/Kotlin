fun main(args: Array<String>) {
    val score = 95

    val grade:Char = when(score/10){
        6 -> 'D'
        7 -> 'C'
        8 -> 'B'
        9, 10 -> 'A'
        else -> 'F'
    }
    println(grade)

    /*
    * var grade:Char = when
    * {
    *  score >= 90 -> 'A'
    *  score >= 80 -> 'B'
    *  score >= 70 -> 'C'
    *  score >= 60 -> 'D'
    *  else -> 'F'
    * }
    */
}