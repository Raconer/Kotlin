package Standard.ex_pair

// Pair 클래스 : 두변수를 하나로 묶기

// Pair클래스는 제네릭을 이요하여 두가지 타입의 값을 보관한다.
fun divide(a:Int, b:Int):Pair<Int,Int> = Pair(a/b, a%b)

fun main(args: Array<String>) {
    val(q, r) =divide(10,3)
    println("몫: $q")
    println("나머지: $r")
}