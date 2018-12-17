package hight.ex_array

/*
 * 배열은 타입이 같은 변수를 여러 개 만들 때 사용하며, 다음과 같이 선언되어 있다.
 * clss Array<T>
 * {
 *  val size: Int
 *  operator fun get(index:Int): T
 *  operator fun set(index:Int, value:T):Unit
 *  operator fun iterator(): Iterator<T>
 * }
 * size 프로퍼티는 배열의 원소 갯수
 * get/set  연산자 멤버 함수는 배열을 [] 연산자로 접근할 수 있게 해준다.
 * iterator 연산자 멤버 함수는 배열을 for 문에 쓸 수 있게 해준다.
 */

fun main(args: Array<String>) {
    val integers:Array<Int> = arrayOf(10, 20, 30, 40)
    println(integers.size)
    println(integers[1])

    for(i in integers)
        print("$i ")
}