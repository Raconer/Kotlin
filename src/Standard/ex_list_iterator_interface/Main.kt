package Standard.ex_list_iterator_interface

/**
 * ListIterator<T> 인터페이스는 Iterator<T> 인터페이스를 구현한다.
 * Iterator<T>의 멤버 외에 추가로 갖는 ListIterator<T>의 멤버는 다음과 같다.
 *
 *  abstract fun hasPrevious():Boolean
 *      hasPreviout 멤버 함수는 이전 원소가 존재하는지 여부를 반환한다.
 *
 *  abstract fun previous():T
 *      previous 멤버 함수는 이전 원소를 반환하고, ListIterator의 커서를 뒤로 한 칸 옮긴다.
 *
 *  abstract fun nextIndex():Int
 *      nextIndex 멤버 함수는 다음 원소의 인덱스를 반호나한다. 커서를 옮기지는 않는다.
 *
 *  abstract fun previousindex():Int
 *      previousIndex 멤버 함수는 이전 원소의 인덱스를 반환한다. 커서를 옮기지는 않는다.
 **/

private fun moveToNext(iter:ListIterator<Int>){
    print("${iter.hasPrevious()}, ")
    print("${iter.hasNext()}, ")
    print("${iter.previousIndex()}, ")
    print("${iter.nextIndex()}, ")
    print("${iter.next()} ")
}

fun main(args: Array<String>) {
    val iter:ListIterator<Int> = listOf(10, 20, 30).listIterator()


    moveToNext(iter)
    moveToNext(iter)
    moveToNext(iter)
}