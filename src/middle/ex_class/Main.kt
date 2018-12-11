package middle.ex_class

class Person
{
    var name:String = ""
    var age:Int = 0
}

fun main(args: Array<String>) {
    var person:Person
    person = Person()
    person.name = "홍길동"
    person.age = 36

    var person2 = Person()
    person.name = "김미영"
    person.age = 29

    val person3 = Person()
    person.name = "John"
    person.age = 52

}