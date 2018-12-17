package Standard.ex_measure_performance

import kotlin.system.measureNanoTime
import kotlin.system.measureTimeMillis


// 코드 성능 확인 하기
fun main(args: Array<String>) {
    println(measureTimeMillis {
        var sum = 0L
        for(i in 1..10000000)
            sum += i
    })

    println(measureNanoTime {
      var sum = 0L
        for( i in 1..1000000)
            sum += i
    })
}