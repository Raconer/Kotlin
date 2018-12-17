package middle.ex_triple_equals


/**
 * 코틀린에서 === 는 자바에서 == 과 같다
 * 코틀린에서 ==  는 자바에서 equals와 같다
 *
 * equals는 내용을 비교 하지만
 *  == 는 객체 자체를 비교한다.
 * */
fun main(args: Array<String>) {
    var a = "one"
    var b = "one"

    println("$a,$b = ${a===b}")

    b = "on"
    b += "e"
    println("$a,$b = ${a !== b}")

    b = a
    println("$a,$b = ${a === b}" )
}