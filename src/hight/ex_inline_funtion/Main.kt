package hight.ex_inline_funtion


// 지난 예제에서 함수를 호출하면 함수 속으로 실행 흐름이 점프하고,
// 함수가 끝나면 함수를 호출 했던 지점으로 다시 점프한다고 했었다.
// 이때 발생하는 실행 흐름의 이동은 프로그램의 성능을 미세하게 저해한다.
// inline 함수를 사요하면 , 실행 흐름을 점프하지 않고 함수 호출문을
// 함수의 몸체로 대체하기 때문에 성능을 조금이나마 개선할수 있다.
inline fun hello()
{
    println("Hello")
    println("Kotlin")
}

fun main(args: Array<String>) {
    hello()
    hello()
    hello()
}