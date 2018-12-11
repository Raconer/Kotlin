package hight.ex_object_declaration

// 프로그램을 작성하다 보면 프로그램 전체에서 공유할 수 있는 하나 뿐인 객체가 필요할 때가 있따.
// 객체 선언
object Person
{
    var name:String = ""
    var age:Int = 0
    fun print()
    {
        println(name)
        println(age)
    }
}

fun main(args: Array<String>) {
    // 식별자 Person으로 객체에 바로 접근 가능
    Person.name = "Singleton"
    Person.age = 45
    Person.print()
}