package middle.ex_indexed_access_operator

fun main(args: Array<String>) {
    val person = Person("Kotlin","2016-02-15")
    // person[0]은 person.get(0)과 같다
    println(person[0])
    println(person[1])
    println(person[-1])

    person[0] = "Java" // person.set(0, "Java") 로 번역된다.
    println(person.name)
}