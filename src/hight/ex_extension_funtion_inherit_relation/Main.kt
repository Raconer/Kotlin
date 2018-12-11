package hight.ex_extension_funtion_inherit_relation

open class AAA;class BBB:AAA()

fun AAA.hello() = println("AAA")
fun BBB.hello() = println("BBB")

fun main(args: Array<String>) {
    val test:AAA = BBB()
    // 확장 함수는 멤버 함수와는 다르게 참조 변수가 실제로 가리키는 객체의 타입을 따르지 않고
    // 참조 변수의 타입을 그대로 따른다.
    test.hello()
}