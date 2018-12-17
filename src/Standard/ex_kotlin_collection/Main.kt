package Standard.ex_kotlin_collection

// 컬렉션(Collection)이란, 프로그램을 개발하는데 필요한 기본적인 자료구조들을 통칭하는 말이다. 코틀린에는 크게 세가지 컬렉션이 있다.
/**
 * List : 순서가 있는 목록을 표현하는 자료구조이다. 동적 배열(Dynamic Array)이나 연결 리스트 (Linked List)가 여기에 포함된다.
 * Set : 집합을 표현하는 자료구조이다. 원소의 중복을 허용하지 않으며 각 원소는 순서를 갖지 않는다.
 * Map : 연관 배열(Associative Array)을 표현하는 자료구조이다. 키와 값을 1:1로 대응시켜 저장한다. 키는 중복될수 없다.
 **/

fun main(args: Array<String>) {
    val list:Collection<Int> = listOf(10, 20, 10)
    val set:Collection<Int> = setOf(1, 2, 3, 2, 3)
    val map:Map<String, String> = mapOf("Apple" to "사과", "Banana" to " 바나나")

    println(list)
    println(set)
    println(map)

}