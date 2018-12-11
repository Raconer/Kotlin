package hight.ex_range

//.. 연산자는 범위를 표현하는 연산자이다.
// .. 연산자는 operator fun rangeTo(매개변수: 자유 타입): 자유 타입으로 오버로딩할 수 있다.
// Int 클래스에는 다음과 같이  rangeTo가 선언 되어있다.
fun main(args: Array<String>) {
    val oneToTen:IntRange = 1..10
    println(5 in oneToTen)

    val upperAtoZ:CharRange = 'A'..'Z'
    if('C' in upperAtoZ)
        println("대문자 입니다.")

    if('p' in 'a'..'z')
        println("소문자 입니다.")
}