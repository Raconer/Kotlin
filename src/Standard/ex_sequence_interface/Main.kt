package Standard.ex_sequence_interface

/**
 *  프로그래밍에서 게으르게 계산하다 또는 게으르게 로딩한다의 의미는
 *  값을 미리 계산하여 가지고 있는것이 아니라
 *  필요한 순간에 계산을 시작했다는 것을 뜻한다.
 *
 *  동영상 재생을 예를 들어 보겠다. 우리는 동영상을 재생할대 동영상 전체를 다운하지 않고 우리가 보려는 구간부터 영상을
 *  스트리밍(Streaming)한다.
 *
 *  게으른 계산도 마찬가지로, 모든 데이터를 당장 가지고 있는 척 하면서 실제로는 데이터가 필요한 시점에 계산을 시작한다.
 *
 *  Sequence는 크기가 정해져 있지 않다. 데이터가 게으르게 계산되기 때문에 전체 크기를 한번에 파악할수 없기 때문이다. 따라서 size나 length 같은 프로퍼티는 포함되지 않는다.
 *
 **/

fun main(args: Array<String>) {
    val seq:Sequence<Int> = sequenceOf(1,2,3)

    for(i in seq)
        print("$i ")
}