package middle.ex_garbage_Collection

fun main(args: Array<String>) {
    var result = ""
    var i = 1
    while(i<=100){
        result += "$i"
        i += 1
    }
    println(result)
}