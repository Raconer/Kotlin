package hight.ex_delegated_property

/*
 * 프로그램을 작성하다보면 Int타입의 프로퍼티에 음수가 저장되는 것을 방지 하는 Setter를 정의 할때가 자주있다.
 * var age:Int set(value) if(value >= 0) field =value
 * var salary:Int set(value) if(value >= 0) field =value
 *
 * 그러나 이렇게 모든 프로퍼티의 Setter를 일일이 정의 하는것은 너무 번거롭다.
 *
 * 코틀린에서는 이런 상황을 위해 프로퍼티의 Getter/Setter 구현을 다른 객체에 맡길수 있는 문법을 제공한다.
 * Sample.kt파일
 */

fun main(args: Array<String>) {
    val sample = Sample()

    sample.number = -50
    println(sample.number)

    sample.number = 100
    println(sample.number)
}