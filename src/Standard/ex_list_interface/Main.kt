package Standard.ex_list_interface

/**
 *  List 인터페이스는 다음과 같이 선언 되어 있다.
 *      interface List<out E>: collection<E>
 *
 *  List 인터페이스는  다음과 같은 추상 멤버 함수를 갖고 있다.
 *  abstract operator fun get(index:Int):E
 *      get은 List의 index번째 원소를 반환하는 멤버 함수이다.
 *      List에 []연산자를 쓸 수 있도록 하는 역할도 한다.
 *
 *  abstract fun indexOf(element:E):Int
 *      indexOf은 element 원소가 List의 몇 번째 인덱스에 위치해 있는지를 반환하는 멤버 함수이다.
 *      만약, element에 해당하는 원소가 없으면 -1을 반환하낟.
 *      element와 동일한 원소가 여러 개 있으면, 첫번재로 일치 하는 원소의 인덱스를 반환한다.
 *
 *  abstract fun lastIndexOf(elementLE):Int
 *      lastIndexOf멤버 함수는 마지막으로 일치하는 원소의 인덱스를 반환한다는 점만 빼면 indexOf과 같다.
 *
 *  abstract fun listIterator():ListIterator<E>
 *  abstract fun listIterator(index:Int):ListIterator<E>
 *      list Iterator는 List에 특화된 Iterator를 반환하는 멤버 함수이다.
 *      index 매개 변수에 값을 지정하면, 그 인덱스 부터 시작하는 List Iterator를 반환한다.
 *  abstract fun subList(fromIndex:Int, toIndex:Int):List<E>
 *      subList는 [fromIndex, toIndex)구간의 원소를 뽑아 새로운 List를 만들어 반환하는 멤버 함수이다.
 **/

fun main(args: Array<String>) {
    val list:List<Double> = listOf(20.18, 1.14, 9.15, 1.14)

    println(list[0])
    println(list.indexOf(1.14))
    println(list.indexOf(9.31))
    println(list.lastIndexOf(1.14))
    println(list.subList(0, 3))
}