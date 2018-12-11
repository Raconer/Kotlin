package beginner

fun main(args: Array<String>): Unit{
    // 문자열 안에 표현식의 값을 집어 넣기
    // 사람이 읽고 쓰기 좋게 추가적으로 제공하는 문법을
    // 문법적 설탕(Syntactic Sugr)이라고 부른다..
    val a = 10
    var b = 20

    println("a의 값: $a")
    println("b의 값: $b")

    println("a+b = ${a + b}")
}