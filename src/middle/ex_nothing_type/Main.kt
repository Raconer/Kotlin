package middle.ex_nothing_type

//Nothing 타입은 실행 흐름이 도달할 수 없는 구역을 나타내기 위한 특수 타입이다.
fun throwing():Nothing = throw Exception()

fun main(args: Array<String>) {
    println("start")
    val i:Int = throwing()
    println(i)
}