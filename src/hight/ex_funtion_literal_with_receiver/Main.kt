package hight.ex_funtion_literal_with_receiver

fun main(args: Array<String>) {
    // Int 리시버를 [left, right]범위 이내로 가공하여 반환하는 확장 함수
    // Int.(left: Int, right:Int)-> Int는 리시버 타입이 Int
    // 함수 리터럴에 리시버를 적용하여 확장 함수 처럼 만들수 있다.
    val makeSure:Int.(left:Int, right:Int) -> Int

    makeSure = {left:Int, right:Int ->
        if(this < left) left
        else if(this > right) right
        else this
    }
    println(15.makeSure(20, 40))
    println(18.makeSure(0, 50))
    println(25.makeSure(0, 19))
}