package middle.ex_triple_equals

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