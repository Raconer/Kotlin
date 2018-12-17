package middle.ex_secondary_constructor


// 보조 생성자는 결국 받는 인자가 다른 생성자 이다.
class Time(val second:Int){
    init {
        println("init 블록 실행 중")
    }
    // 보조 생성자_1
    constructor(minute:Int, second:Int):this(minute * 60 +second)
    {
        println("보조 생성자 1 실행중")
    }
    // 보조 생성자_2
    constructor(hour:Int, minute:Int, second:Int):this(hour* 60 + minute, second){
        println("보조 생성자 2 실행중")
    }
    init {
        println("또다른 init 블록 실행 중")
    }
}

fun main(args: Array<String>) {
    println("${Time(15,6).second}초")
    println("${Time(6,3, 17).second}초")
}