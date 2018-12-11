package hight.ex_anonymous_function


// 이전 예제의 람다식으로 된 함수 리터럴을 익명함수의 형태로 바꿔보았다
// 익명 함수는 함수의 이름이 없다는 점만 빼면 일반 함수와 형태가 거이 동일하다.
// 익명함수는 람다식 보다 복잡하지만, return으로 반환값을 직접 지정해 줄수 있기 때문에
// 마지막 표현식이 자동으로 반환 값이 되어 버리는 람다식 보다는 버그를 일으킬 확률이 적다.
fun main(args: Array<String>) {
    val instantFunc:(Int) -> Unit = fun(number:Int): Unit
    {
        println("Hello $number")
    }
    instantFunc(33)
    instantFunc.invoke(33)
}