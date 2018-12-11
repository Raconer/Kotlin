package hight.ex_const

import java.time.LocalDateTime
import java.util.*
import kotlin.concurrent.timerTask

// inline 함수와 비슷하게, val변수 앞에 const키워드를 붙이면 변수에 접근하는 코드를 변수에 저장된 값으로 대체시킨다.

val hello ="Hello"+"World!"

object Foo
{
    const val bar = "bar"
}

fun main(args: Array<String>) {

    val t:TimerTask = timerTask {
        println("타이머 돌아가나요?")

    }
    println("start ${LocalDateTime.now().nano}")
    println(hello)
    println(Foo.bar)
    println(hello)
    println(Foo.bar)
    Timer().schedule(t, 10000)
    println("end ${LocalDateTime.now().nano}")
}
