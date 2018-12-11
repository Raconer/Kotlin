package beginner

fun main(args: Array<String>) {
    println(15 and 7)   // 7 출력 // 15와 17을 비트 단위로 and 연산
    println(5 or 2)     // 7  출력 // 5와 2 를 비트 단위로 or 연산
    println(15 xor 5)   // 10출력 // 15와 5를 비트 단위로 xor연산
    println(32767.inv())// -32768 출력 // 32767을 비트 단위로 반전
    println(1 shl 3)    // 8출력 // 1을 왼쪽으로 3칸 시프트
    println(8 shr 1)    // 4 출력 // 8 을 오른 쪽으로 1칸 시프트
    println(-17 ushr 2) // 1073741819 출력 // 부호를 유지한테 -17을 오른쪽으로 2칸 시프트
}