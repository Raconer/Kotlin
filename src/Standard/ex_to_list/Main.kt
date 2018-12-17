package Standard.ex_to_list

fun main(args: Array<String>) {
    // NOTE: pair의 타입 인수가 모두 같아야 한다.
    val list:List<Int> = Pair(10, 20).toList()
    
    // NOTE: Triple의  타입인수가 모두 같아야한다.
    val list2:List<Double> = Triple(3.1, 6.25, 8.15).toList()
}