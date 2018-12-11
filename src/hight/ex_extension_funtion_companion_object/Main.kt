package hight.ex_extension_funtion_companion_object

class Person{companion object}

// Companion 식별자를 이용하여 동반자 객체에도
// 확장 함수를 달 수 있음을 이해한다.
fun Person.Companion.create() = Person();

fun main(args: Array<String>) = Person.create()