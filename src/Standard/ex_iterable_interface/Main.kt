package Standard.ex_iterable_interface


// Iterable 인터페이스: 클래스가 반복자를 지원하도록 하기
// Iterable 인터페이스는 클래스에 operator fun iterator(): Iterator<T> 연산자 멤버 함수를 주입하기 위한 인터 페이스이다.

fun main(args: Array<String>) {
    val prog:IntProgression = 3..7
    println(prog.first)
    println(prog.last)
    println(prog.step)

    for(i in prog)
        print("$i ")
}