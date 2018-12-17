package practice.ex_java_to_kotlin_operator_overloading


fun main(args: Array<String>) {
    val java = Javaclass()
    println(13 in java)// contains(int any)와 같다
    println(java[13])
    println(java[28])
    println(java[18])

}