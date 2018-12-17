package practice.ex_java_to_kotlin_types

fun main(args: Array<String>) {
    val rand:Double = Math.random()
    println(rand)

    val buffer:StringBuffer = StringBuffer()
    buffer.append("hellow ")
    buffer.append("workdl!")
    val result:String = buffer.toString()
    println(result)
}