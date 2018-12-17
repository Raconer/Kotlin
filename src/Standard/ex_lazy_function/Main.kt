package Standard.ex_lazy_function
//?
class AAA
{
    var num:Int = 0
    // lazy함수를 이용하면 프로퍼티의 값이 필요한 시점에 계산을 시작하게 할 수 있다.
    val num2 by lazy{num * 5}
}

fun main(args: Array<String>) {
    val one = AAA()
    println(one.num2)
    one.num = 10
    println(one.num2)

    val two = AAA()
    two.num = 4
    println(two.num2)
}