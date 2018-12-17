package middle.ex_upcasting


// upcasting 또는 형변환 이란, 특정 타입을 다른 타입으로 변환하는것을 뜻함
// UPCasting =  형변환
// 코틀린에서는 서브 클래스의 인스턴스를 슈퍼 클래스 타입으로 가리킬 수 있다.
// val person:Person = Student("John", 32, 20171218) 서브 클래스를 슈퍼 클래스로 형변환 할수 있다
open class Person(val name:String, val age:Int)

class Student(name:String, age:Int, val id:Int):Person(name, age)

fun main(args: Array<String>) {
    val person:Person = Student("John", 32, 20171218)
    println(person.name)
    println(person.age)
}