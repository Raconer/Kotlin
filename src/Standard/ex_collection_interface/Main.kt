package Standard.ex_collection_interface

import kotlin.streams.toList

/**
 *  Collection 인터페이스의 멤버
 *
 *  interface Collection<out E>: Iterable<E>
 *      Iterable<E>는, fun iterator():Iterator<E> 멤버 함수를 컬렉션에 주입하기 위한 인터 페이스이다.
 *      Collection 인터페이스는 한 개의 추상 프로퍼티와, 네 개의 추상 멤버 함수를 갖고 있다.
 *
 *   abstract val size:Int
 *      size는 컬렉션에 포함된 원소의 개수를 갖는 프로퍼티이다.
 *
 *   abstract fun isEmpty():Boolean
 *      isEmpty()는 컬렉션이 비어 있는지 여부를 반환하는 멤버 함수이다.
 *
 *   abstract operator fun contains(element:E):Boolean
 *      contains는 element원소가 컬렉션에 포함되어 있는지 여부를 반환하는 연산자 멤버 함수이다.
 *      컬렉션에 in 연산자를 쓸 수 있도록 하는 역활도 한다.
 *
 *   abstract fun containsAll(elements: Collection<E>): Boolean
 *      containsAll은 elements의 원소들이 컬렉션에 모두 포함되어 있는지 여부를 반환하는 연산자 멤버 함수이다.
 *
 *   abstract fun iterator():Iterator<E>
 *       iterator는 컬렉션이 각 원소를 순회하는 Iterator<E> 타입의 객체를 반환하는 연산자 멤버 함수이다.
 *       컬렉션을 for문의 in연산자에 사용할 수 있도록 해준다.
 **/

fun main(args: Array<String>) {
    val list:Collection<Int> = listOf(18, 1, 1, 4)

    println(list.size)
    println(list.isEmpty())
    println(18 in list)

    for(i:Int in list)
        print("$i ")

    println("\n${list}")
}