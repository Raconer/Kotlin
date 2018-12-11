package hight.ex_reified_type_parameter

/*
 *   타입 매개변수는 대부분의 상황에서 일반 타입처럼 쓸 수 있지만, 특정 상황에서는 그렇지 못하다.
 *   예)
 *   fun <T>check()
 *   {
 *      val number = 0
 *      if(number is T)
 *          println("T는 Int타입입니다.")
 *   }
 *
 *   타입 매개변수는 is 연산자의 피 연산자로 사용할 수 없다.
 *   타입 매개변수를 is 연산자의 피 연산자로 사용하고 싶으면 다음과 같이 해야한다.
 */

// Reified : 구체화된
// 타입 매개변수 앞에 refied를 붙여주면 해당 타입 매개 변수를 in연산자에 사용할수 있다.
// 타입 매개변수에 reified를 붙이려면 반듯이 함수에 inline dmfh tjsdjsgodigksek.
inline fun<reified T>check()
{
    val number = 0
    if(number is T)
        println("T는 Int 타입입니다.")
}

fun main(args: Array<String>) {
    check<Int>()
}
