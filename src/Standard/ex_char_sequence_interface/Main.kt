package Standard.ex_char_sequence_interface

/*
 * CharSequence는 String, StringBuilder 등, 문자열과 관련된 클래스들이 구현하는 기본적인 뼈대 인터페이스이다.
 * 이름상으로는 CharSequence이 Sequence 인터페이스를 상속할 것 같지만, 사실은 어떠한 인터페이스도 상속 하고 있지 않으니 주의 하기 바란다.
 */

fun main(args: Array<String>) {
    val seq:CharSequence = "Hello"
    println(seq.length)
    println(seq[2])
    println(seq.subSequence(1, 4))
}