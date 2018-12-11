package hight.ex_iterator

/*
 * 반복자(Iterator)란, 특정 구간 속에 잇는 원소를 하나씩 반복적으로 꺼내기 위한 인터페이스를 뜻한다,.
 * 코틀린에는 Iterator라는 인터페이스가 기본적으로 선언되어 있으며 다음과 같이 생겼다.
 *
 * interface Iterator<out T>
 * {
 *      operator fun next():T
 *      operator fun hasNext():boolean
 * }
 *
 * 예제를 통해 next와 hasNext 멤버 함수를 언제 사용하는지 알아보자
 */

fun main(args: Array<String>) {
    // IntRange 클래스에는 operator fun iterator():IniIterator 연산자 멤버 함수가 선언되어 있다.
    // IntIterator는 Iterator<Int>를 구현하는 클래스이기 때문에 Iterator<Int> 타입으로 받을수있다.
    val range:IntRange = 1..3
    val iter:Iterator<Int> = range.iterator()

    println(iter.hasNext())
    println(iter.next())

    println(iter.hasNext())
    println(iter.next())

    println(iter.hasNext())
    println(iter.next())

    println(iter.hasNext())

}