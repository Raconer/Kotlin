fun main(args: Array<String>): Unit {
    println(myFunction())
    println(myFunction() + 10)
}

fun myFunction():Int{
    var a = 3
    var b = 6
    println("a : "+ a + ",b:" + b)
    return a + b
}