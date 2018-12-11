package middle.ex_memory_heap

fun main(args: Array<String>) {
    val person = object{
        var name:String = "홍길동"
        var age:Int = 36
    }

    println(person.name)
    println(person.age)
}