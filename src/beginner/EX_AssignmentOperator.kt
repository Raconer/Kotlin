package beginner

fun main(args: Array<String>):Unit {
    var a:Int
    var b:Int

    a = 10 + 5
    b = 10

    b+= a //b에 a를 누적
    println(b)

    b%= 3 // b를 3으로 나눈 나머지를 b에 저장
    println(b)
}