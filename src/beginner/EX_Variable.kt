// 3
fun main(args: Array<String>) {

    // var 은 일반 변수
    // val은 final 변수(Immutable Variable)
    /* var   : 변수 키워드
    *  total : 변수 이름(식별자)
    *  Int   : 변수 타입*/
    var total: Int
    total = 0

    val a:Int = 10 + 53 -7
    println(a)

    var b:Int = 43 + 75 + a
    println(b)

    total = a + b
    println(total)
}