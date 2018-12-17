package practice.ex_java_to_kotlin_class_reference

fun main(args: Array<String>) {
    val number:Int = 26
    val str:String = "2016"

    // 인스턴스 뒤에 ::class.java를 적으면, 자바와 호환되는 Class<T> 타입의 객체를 가져온다.
    JavaClass.printClassInfo(number::class.java)
    JavaClass.printClassInfo(str::class.java)
    JavaClass.printClassInfo(Double::class.java)
}