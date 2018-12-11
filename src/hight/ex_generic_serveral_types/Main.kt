package hight.ex_generic_serveral_types

// 타입인수를 여러개 받을려면 fun 키워드와 함수 이름 사이를  <타입 1, 타입 2,...> 형식으로 적는다.
fun <T, R> T.map(mapper:(T) -> R):R
{
    return mapper(this)
}

// 매개 변수로 받은 mapper 함수에 리시버를 넣어 호출한뒤, 반환 값을 그대로 반환하고 있다.
// 타입 매개 변수를 항상 일반 타입처럼 쓸수 있는 것은 아니다.
fun main(args: Array<String>) {
    val square:Double =
            11.0.map{
                it*it
            }
    println(square)
}