package Standard.ex_thread_function

import kotlin.concurrent.thread
import kotlin.system.measureTimeMillis

fun main(args: Array<String>) {
    println(
            measureTimeMillis {
                testTread()
            }
    )
}

fun testTread(){
    thread(start = true){
        print("Hello, ")
        Thread.sleep(1000)
        print("word")
    }

    Thread.sleep(500)
    print("Kotlin ")
}