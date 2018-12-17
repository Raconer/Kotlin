package Standard.ex_exit_process_function

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    something(-1)
    println("Hello")
}

fun something(num:Int){
    if(num < 0)
        exitProcess(0) // 프로그램 종료
}