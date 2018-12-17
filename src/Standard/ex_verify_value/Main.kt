package Standard.ex_verify_value

fun func(num:Int?){
    // 만약 null이면 IlliegalStateException 예외를 던진다.
    // null이면 Non-null 타입으로 캐스팅 하여 그대로 반환한다.
    checkNotNull(null)
    check(num!!>= 0)
}

fun func2(num:Double?){
    //
    requireNotNull(null)
    require(num!!.isNaN())
}

fun main(args: Array<String>) {
    func(10)
    func2(0.0/0.0)
}