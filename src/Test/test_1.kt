package Test

/**
  * 상수 : 변하지 않는 변수
  * int a = 1;
  * int 앞에 final을 붙일 시, a는 상수(constant)가 된다.
  * 여기서 리터럴은 1이다.
  * 즉, 1과 같이 변하지 않는 데이터를 리터럴 이라고 부른다.
  *
  */
class Person(name:String, age:Int)
{
    var name:String
    var age:Int
    var hobby:String = ""

    init {
        this.name = name + "_init"
        this.age = age
    }

    constructor(name: String,age: Int, hobby:String):this(name, age){
        this.hobby = "${age}살 ${name}의 취미는 "+hobby
    }

    override fun toString(): String {
        return "name : ${this.name}, age : ${this.age}, hobby : ${this.hobby}"
    }
}

fun test(vararg testData:Int, testSting:String){
    println(testData.size)
    println(testSting)
}

fun main(args: Array<String>) {
    var a = 100

        val person = Person("dhokim", 28, "탁구")
        println(person.toString())

    /*test(1, 2, 3, 4, 5, 6, 7, 8, 9, testSting = "test")

    println("${a}")
    for(a in 1 until 10){
        println(a)
    }*/
}