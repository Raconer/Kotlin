package Standard.ex_closed_range_interface

fun main(args: Array<String>) {
    val intRange:IntRange = 1..10
    val longRange:LongRange = 1L..100L
    val charRange:CharRange = 'A'..'Z'

    println(intRange.start) // 시작
    println(longRange.endInclusive) // 끝
    println('*' in charRange) // 포함
    println(charRange.isEmpty()) // Empty 체크
}